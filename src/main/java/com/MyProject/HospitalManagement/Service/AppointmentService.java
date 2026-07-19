package com.MyProject.HospitalManagement.Service;

import com.MyProject.HospitalManagement.Entity.Appointment;
import com.MyProject.HospitalManagement.Entity.Doctor;
import com.MyProject.HospitalManagement.Entity.Patient;
import com.MyProject.HospitalManagement.repository.AppointmentRepository;
import com.MyProject.HospitalManagement.repository.DoctorRepository;
import com.MyProject.HospitalManagement.repository.PatientRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AppointmentService {
    private final AppointmentRepository appointmentRepository;
    private final PatientRepository patientRepository;
    private final DoctorRepository doctorRepository;

    public Appointment createANewAppointment(Appointment appointment, Long patientId, Long doctorId){
        Patient patient = patientRepository.findById(patientId).orElseThrow();
        Doctor doctor = doctorRepository.findById(doctorId).orElseThrow();
        appointment.setPatient(patient);
        appointment.setDoctor(doctor);
        appointmentRepository.save(appointment);
        return appointment;
    }
}
