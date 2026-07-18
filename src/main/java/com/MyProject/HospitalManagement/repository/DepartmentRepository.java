package com.MyProject.HospitalManagement.repository;

import com.MyProject.HospitalManagement.Entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {

}