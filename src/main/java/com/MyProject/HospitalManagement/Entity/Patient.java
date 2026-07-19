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

    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    @JoinColumn(name = "patient_insurance", unique = true)
    @ToString.Exclude
    private Insurance insurance;

    @OneToMany(mappedBy = "patient" , cascade = CascadeType.ALL , fetch = FetchType.EAGER) // Inverse side
    private Set<Appointment> appointments =  new HashSet<>();
}
