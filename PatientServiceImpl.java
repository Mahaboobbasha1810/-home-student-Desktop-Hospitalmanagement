package com.lifecare.Lifecare.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.lifecare.Lifecare.entity.Patient;
import com.lifecare.Lifecare.repository.PatientRepository;
import com.lifecare.Lifecare.service.PatientService;

@Service
public class PatientServiceImpl implements PatientService { // Change "DoctorServiceImpl" to "PatientServiceImpl"

    private final PatientRepository patientRepository; // Change "DoctorRepository" to "PatientRepository"

    public PatientServiceImpl(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    @Override
    public List<Patient> getAllPatient() { // Change "Doctor" to "Patient"
        return patientRepository.findAll(); // Change "DoctorRepository" to "PatientRepository"
    }

    @Override
    public Patient savePatient(Patient patient) { // Change "Doctor" to "Patient"
        return patientRepository.save(patient); // Change "DoctorRepository" to "PatientRepository"
    }

    @Override
    public Patient getPatientById(Long id) { // Change "Doctor" to "Patient"
        return patientRepository.findById(id).orElse(null); // Change "DoctorRepository" to "PatientRepository"
    }

    @Override
    public Patient updatePatient(Patient patient) { // Change "Doctor" to "Patient"
        return patientRepository.save(patient); // Change "DoctorRepository" to "PatientRepository"
    }

    @Override
    public void deletePatientById(long id) {
        patientRepository.deleteById(id);
    }

    public Patient findById(Long id) {
        return patientRepository.findById(id).orElse(null);
    }
}

