package com.lifecare.Lifecare.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.lifecare.Lifecare.entity.Appointment;
import com.lifecare.Lifecare.repository.AppointmentRepository;
import com.lifecare.Lifecare.service.AppointmentService;

@Service
public class AppointmentServiceImpl implements AppointmentService {

    private final AppointmentRepository appointmentRepository;

    public AppointmentServiceImpl(AppointmentRepository appointmentRepository) {
        this.appointmentRepository = appointmentRepository;
    }

    @Override
    public List<Appointment> getAllAppointments() {
        return appointmentRepository.findAll();
    }

    @Override
    public Appointment saveAppointment(Appointment appointment) {
        return appointmentRepository.save(appointment);
    }

    @Override
    public Appointment getAppointmentById(Long id) {
        return appointmentRepository.findById(id).orElse(null);
    }

    @Override
    public Appointment updateAppointment(Appointment appointment) {
        return appointmentRepository.save(appointment);
    }

    @Override
    public void deleteAppointmentById(Long id) {
        appointmentRepository.deleteById(id);
    }

    @Override
    public List<Appointment> findAppointmentsWithIdGreaterThanOrderByID(Long id) {
        return appointmentRepository.findAppointmentsWithIdGreaterThanOrderByID(id);
    }

    public Appointment findById(Long id) {
        return appointmentRepository.findById(id).orElse(null);
    }
}
