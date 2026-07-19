package com.MyProject.HospitalManagement.Service;

import com.MyProject.HospitalManagement.Entity.Insurance;
import com.MyProject.HospitalManagement.Entity.Patient;
import com.MyProject.HospitalManagement.repository.InsuranceRepository;
import com.MyProject.HospitalManagement.repository.PatientRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class InsuranceService {

    private final InsuranceRepository insuranceRepository;

    private final PatientRepository patientRepository;

    @Transactional
    public Insurance assignInsuranceToPatient(Insurance insurance, Long patientId) {
        Patient patient = patientRepository.findById(patientId).orElseThrow();
        patient.setInsurance(insurance);  // Data Dirtied.
        insurance.setPatient(patient);  // Bidirectional consistency

        return insurance;
    }

    @Transactional
    public Insurance updateInsurance(Insurance insurance, Long patientId) {
        Patient patient = patientRepository.findById(patientId).orElseThrow();
        patient.setInsurance(insurance);
        insurance.setPatient(patient);
        return insurance;
    }

    @Transactional
    public Patient removeInsuranceFromPatient( Long patientId) {
        Patient patient = patientRepository.findById(patientId).orElseThrow();
        patient.setInsurance(null);
        return patient;
    }


}
