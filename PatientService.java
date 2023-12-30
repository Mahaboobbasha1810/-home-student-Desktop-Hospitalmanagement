package com.lifecare.Lifecare.service;

import java.util.List;

import com.lifecare.Lifecare.entity.Patient;

public interface PatientService { // Change "DoctorService" to "PatientService"

    List<Patient> getAllPatient(); // Change "Doctor" to "Patient"
    Patient savePatient(Patient patient); // Change "Doctor" to "Patient"
    Patient getPatientById(Long id); // Change "Doctor" to "Patient"
    Patient updatePatient(Patient patient); // Change "Doctor" to "Patient"
    void deletePatientById(long id);
    Patient findById(Long id);
}
