package com.lifecare.Lifecare.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.lifecare.Lifecare.entity.Staff;
import com.lifecare.Lifecare.repository.StaffRepository;
import com.lifecare.Lifecare.service.StaffService;

@Service
public class StaffServiceImpl implements StaffService { // Change "Patientserviceimpl" to "StaffServiceImpl"

    private final StaffRepository staffRepository; // Change "PatientRepository" to "StaffRepository"

    public StaffServiceImpl(StaffRepository staffRepository) {
        this.staffRepository = staffRepository;
    }

    @Override
    public List<Staff> getAllStaff() { // Change "Patient" to "Staff"
        return staffRepository.findAll(); // Change "PatientRepository" to "StaffRepository"
    }

    @Override
    public Staff saveStaff(Staff staff) { // Change "Patient" to "Staff"
        return staffRepository.save(staff); // Change "PatientRepository" to "StaffRepository"
    }

    @Override
    public Staff getStaffById(Long id) { // Change "Patient" to "Staff"
        return staffRepository.findById(id).orElse(null); // Change "PatientRepository" to "StaffRepository"
    }

    @Override
    public Staff updateStaff(Staff staff) { // Change "Patient" to "Staff"
        return staffRepository.save(staff); // Change "PatientRepository" to "StaffRepository"
    }

    @Override
    public void deleteStaffById(long id) {
        staffRepository.deleteById(id);
    }

    public Staff findById(Long id) {
        return staffRepository.findById(id).orElse(null);
    }
}
