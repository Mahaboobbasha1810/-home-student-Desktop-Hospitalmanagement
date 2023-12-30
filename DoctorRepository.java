package com.lifecare.Lifecare.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.lifecare.Lifecare.entity.Doctor; // Change "Patient" to "Doctor"

@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Long> { // Change "PatientRepository" to "DoctorRepository"

    @Query("SELECT d FROM Doctor d WHERE d.id > :doctorId ORDER BY d.id") // Change "Patient" to "Doctor"
    List<Doctor> findDoctorsWithIdGreaterThanOrderByID(@Param("doctorId") Long id); // Change "Patient" to "Doctor"

}
