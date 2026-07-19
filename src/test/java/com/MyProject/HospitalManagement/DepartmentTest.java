package com.MyProject.HospitalManagement;

import com.MyProject.HospitalManagement.Entity.Department;
import com.MyProject.HospitalManagement.Service.DepartmentService;
import com.MyProject.HospitalManagement.repository.DepartmentRepository;
import com.MyProject.HospitalManagement.repository.DoctorRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Set;

@SpringBootTest
public class DepartmentTest {
    @Autowired
    private DepartmentService departmentService;

    @Autowired
    private DoctorRepository doctorRepository;

    @Autowired
    private DepartmentRepository departmentRepository;

    @Test
    public void assignDoctorInDepartmentTest(){
        Department updatDepartment= departmentService.assignDoctor(1L,1L, Set.of(1L,2L,3L));

        System.out.println(updatDepartment);
    }
}
