package com.lifecare.Lifecare.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.lifecare.Lifecare.entity.Appointment;

import java.util.List;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
    
    @Query("SELECT a FROM Appointment a WHERE a.id > :appointmentId ORDER BY a.id")
    List<Appointment> findAppointmentsWithIdGreaterThanOrderByID(@Param("appointmentId") Long id);
}

