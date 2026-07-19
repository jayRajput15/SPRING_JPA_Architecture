package com.MyProject.HospitalManagement;


import com.MyProject.HospitalManagement.DTO.BloodGroupStats;
import com.MyProject.HospitalManagement.DTO.CPatientInfo;
import com.MyProject.HospitalManagement.DTO.IPatientInfo;
import com.MyProject.HospitalManagement.Entity.Patient;
import com.MyProject.HospitalManagement.Entity.Type.BloodGroupType;
import com.MyProject.HospitalManagement.Service.PatientService;
import com.MyProject.HospitalManagement.repository.PatientRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class PatientTest {

    @Autowired
    private PatientRepository patientRepository;
    @Autowired
    private PatientService patientService;

    @Test
    public void testPatientRepository(){
        //List<Patient> patientList = patientRepository.findAll();
//        List<BloodGroupStats> patientList = patientRepository.getAllBloodGroupType();
//       for( BloodGroupStats patient : patientList ){
//           System.out.println(patient);
//       }
//        int affectRow = patientRepository.updatePatientNameWithId("Anuj",1L);
//        System.out.println(affectRow);

        List<Patient> patients = patientRepository.getAllPatientsWithAppointment();
        for( var p : patients){
            System.out.println(p);
        }

    }

    @Test
    public void testTransactionMethods(){
        Patient patient = patientService.getPatientBYId(1l);
        System.out.println(patient);
    }
}
