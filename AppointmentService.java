package com.lifecare.Lifecare.service;
import java.util.List;

import com.lifecare.Lifecare.entity.Appointment;

public interface AppointmentService {
    
    List<Appointment> getAllAppointments();

    Appointment saveAppointment(Appointment appointment);

    Appointment getAppointmentById(Long id);

    Appointment updateAppointment(Appointment appointment);

    void deleteAppointmentById(Long id);

    List<Appointment> findAppointmentsWithIdGreaterThanOrderByID(Long id);
}

