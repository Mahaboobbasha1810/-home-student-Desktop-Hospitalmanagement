package com.lifecare.Lifecare;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.lifecare.Lifecare.entity.Doctor; // Change Patient to Doctor

import com.lifecare.Lifecare.repository.DoctorRepository; // Change PatientRepository to DoctorRepository
import com.lifecare.Lifecare.repository.PatientRepository;
import com.lifecare.Lifecare.repository.StaffRepository;


@SpringBootApplication
public class LifeCareApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(LifeCareApplication.class, args);
    }

    @Autowired
    private DoctorRepository doctorRepository; 
    @Autowired
    private PatientRepository patientRepository; 
    @Autowired
    private StaffRepository staffRepository; 
    @Override
    public void run(String... args) throws Exception {
        // Your logic here
    }

}

