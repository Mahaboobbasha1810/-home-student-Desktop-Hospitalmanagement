package com.lifecare.Lifecare.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.lifecare.Lifecare.entity.Patient;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> { // Change "DoctorRepository" to "PatientRepository"

    @Query("SELECT p FROM Patient p WHERE p.id > :patientId ORDER BY p.id") // Change "Doctor" to "Patient"
    List<Patient> findPatientsWithIdGreaterThanOrderByID(@Param("patientId") Long id); // Change "Doctor" to "Patient"

}
