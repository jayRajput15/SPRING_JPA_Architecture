package com.MyProject.HospitalManagement.repository;


import com.MyProject.HospitalManagement.DTO.BloodGroupStats;
import com.MyProject.HospitalManagement.DTO.CPatientInfo;
import com.MyProject.HospitalManagement.DTO.IPatientInfo;
import com.MyProject.HospitalManagement.Entity.Patient;
import com.MyProject.HospitalManagement.Entity.Type.BloodGroupType;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PatientRepository extends JpaRepository<Patient,Long> {

    @Query("select p.id as id, p.name as name, p.email as email  from Patient p")
    List<IPatientInfo> getAllPatientInfo();

    @Query("select new com.MyProject.HospitalManagement.DTO.CPatientInfo  (p.id , p.name ) " +  "  from Patient p")
    List<CPatientInfo> getAllPatientInfoConcrete();

    @Query("select new com.MyProject.HospitalManagement.DTO.BloodGroupStats(p.bloodGroupType ," + " COUNT(p) )from Patient p group by p.bloodGroupType order by COUNT(p)")
    List<BloodGroupStats> getAllBloodGroupType();

    @Transactional
    @Modifying
    @Query("update Patient p set p.name = :name where p.id = :id")
    int updatePatientNameWithId(@Param("name")  String name, @Param("id") Long id);

    @Query("select p from Patient p LEFT JOIN FETCH p.appointments")
    List<Patient> getAllPatientsWithAppointment();


}
