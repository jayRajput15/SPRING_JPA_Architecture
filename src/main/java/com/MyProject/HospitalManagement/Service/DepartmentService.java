package com.MyProject.HospitalManagement.Service;

import com.MyProject.HospitalManagement.Entity.Department;
import com.MyProject.HospitalManagement.Entity.Doctor;
import com.MyProject.HospitalManagement.repository.DepartmentRepository;
import com.MyProject.HospitalManagement.repository.DoctorRepository;
import com.MyProject.HospitalManagement.repository.PatientRepository;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@AllArgsConstructor
public class DepartmentService {

    private DepartmentRepository departmentRepository;

    private DoctorRepository doctorRepository;

    @Transactional
    public Department assignDoctor(Long departmentId, Long headDoctorId, Set<Long> doctorIds) {
        Department department = departmentRepository.findById(departmentId).orElseThrow();
        Doctor headDoctor = doctorRepository.findById(headDoctorId).orElseThrow();
        department.setHeadDoctor(headDoctor);
        Set<Doctor> doctors = new HashSet<>(doctorRepository.findAllById(doctorIds));
        department.setDoctors(doctors);
        return departmentRepository.save(department);
    }

}
