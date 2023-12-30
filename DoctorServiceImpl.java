package com.lifecare.Lifecare.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.lifecare.Lifecare.entity.Doctor; // Change "Patient" to "Doctor"
import com.lifecare.Lifecare.repository.DoctorRepository; // Change "PatientRepository" to "DoctorRepository"
import com.lifecare.Lifecare.service.DoctorService; // Change "Patientservice" to "DoctorService"

@Service
public class DoctorServiceImpl implements DoctorService { // Change "Patientserviceimpl" to "DoctorServiceImpl"

    private final DoctorRepository doctorRepository; // Change "PatientRepository" to "DoctorRepository"

    public DoctorServiceImpl(DoctorRepository doctorRepository) {
        this.doctorRepository = doctorRepository;
    }

    @Override
    public List<Doctor> getAllDoctor() { // Change "Patient" to "Doctor"
        return doctorRepository.findAll(); // Change "PatientRepository" to "DoctorRepository"
    }

    @Override
    public Doctor saveDoctor(Doctor doctor) { // Change "Patient" to "Doctor"
        return doctorRepository.save(doctor); // Change "PatientRepository" to "DoctorRepository"
    }

    @Override
    public Doctor getDoctorById(Long id) { // Change "Patient" to "Doctor"
        return doctorRepository.findById(id).orElse(null); // Change "PatientRepository" to "DoctorRepository"
    }

    @Override
    public Doctor updateDoctor(Doctor doctor) { // Change "Patient" to "Doctor"
        return doctorRepository.save(doctor); // Change "PatientRepository" to "DoctorRepository"
    }

    @Override
    public void deleteDoctorById(long id) {
        doctorRepository.deleteById(id);
    }

    public Doctor findById(Long id) {
        return doctorRepository.findById(id).orElse(null);
    }
}
