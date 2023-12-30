package com.lifecare.Lifecare.service;

import java.util.List;

import com.lifecare.Lifecare.entity.Doctor; // Change "Patient" to "Doctor"

public interface DoctorService { // Change "Patientservice" to "DoctorService"

    List<Doctor> getAllDoctor(); // Change "Patient" to "Doctor"
    Doctor saveDoctor(Doctor doctor); // Change "Patient" to "Doctor"
    Doctor getDoctorById(Long id); // Change "Patient" to "Doctor"
    Doctor updateDoctor(Doctor doctor); // Change "Patient" to "Doctor"
    void deleteDoctorById(long id);
    Doctor findById(Long id);
}
