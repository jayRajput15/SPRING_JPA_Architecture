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

    private InsuranceRepository insuranceRepository;

    private PatientRepository patientRepository;

    @Transactional
    public void assignInsuranceToPatient(Insurance insurance, Long patientId) {
        Patient patient = patientRepository.findById(patientId).orElseThrow();
        patient.setInsurance(insurance);
    }
}
