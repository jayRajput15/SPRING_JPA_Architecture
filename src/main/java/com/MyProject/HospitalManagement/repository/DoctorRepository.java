package com.MyProject.HospitalManagement.repository;

import com.MyProject.HospitalManagement.Entity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {
}