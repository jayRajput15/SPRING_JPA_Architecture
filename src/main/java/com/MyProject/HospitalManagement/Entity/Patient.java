package com.MyProject.HospitalManagement.Entity;


import com.MyProject.HospitalManagement.Entity.Type.BloodGroupType;
import jakarta.persistence.*;
import lombok.ToString;

import java.time.LocalDate;

@Entity
@ToString
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private LocalDate birthDate;

    private String email;

    private  String gender;

    @Enumerated(EnumType.STRING)
    private BloodGroupType bloodGroupType;
}
