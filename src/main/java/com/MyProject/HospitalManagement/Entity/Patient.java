package com.MyProject.HospitalManagement.Entity;


import com.MyProject.HospitalManagement.Entity.Type.BloodGroupType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Entity
@ToString
@Getter
@Setter
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

    @CreationTimestamp
    private LocalDateTime createdAt;

    @OneToOne
    @JoinColumn(name = "patient_insurance", unique = true)
    private Insurance insurance;

    @OneToMany(mappedBy = "patient") // Inverse side
    private Set<Appointment> appointments =  new HashSet<>();
}
