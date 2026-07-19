package com.MyProject.HospitalManagement;

import com.MyProject.HospitalManagement.Entity.Appointment;
import com.MyProject.HospitalManagement.Service.AppointmentService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;

@SpringBootTest
public class AppointmentTest {
    @Autowired
    private AppointmentService appointmentService;

    @Test
    public void  createAppointmentTest(){
        Appointment appointment = Appointment.builder()
                .appointmentTime(LocalDateTime.of(2026,11,4,14,0,0))
                .reason("Cancer")
                .build();

     var UpdatedAppointment =    appointmentService.createANewAppointment(appointment,1L,2L);
     System.out.println(UpdatedAppointment);

    }
}
