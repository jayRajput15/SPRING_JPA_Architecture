package com.MyProject.HospitalManagement;

import com.MyProject.HospitalManagement.Entity.Insurance;
import com.MyProject.HospitalManagement.Entity.Patient;
import com.MyProject.HospitalManagement.Service.InsuranceService;
import com.MyProject.HospitalManagement.Service.PatientService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;



@SpringBootTest
public class InsuranceTest {

    @Autowired
    private InsuranceService insuranceService;
    @Autowired
    private PatientService patientService;


    @Test
    public void testAssignInsuranceToPatient() {
        Insurance insurance = Insurance.builder()
                .provider("HDFC millenium")
                .policyNumber("HDFC_123")
                .validUntil(LocalDate.of(2030, 1, 1))
                .build();

        var updatedInsurance = insuranceService.assignInsuranceToPatient(insurance,1L);
        System.out.println(updatedInsurance);

        patientService.deletePatient(1L);
    }
}
