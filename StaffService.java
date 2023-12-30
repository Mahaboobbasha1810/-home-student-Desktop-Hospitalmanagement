package com.lifecare.Lifecare.service;

import java.util.List;

import com.lifecare.Lifecare.entity.Staff;

public interface StaffService { // Change "DoctorService" to "StaffService"

    List<Staff> getAllStaff(); // Change "Doctor" to "Staff"
    Staff saveStaff(Staff staff); // Change "Doctor" to "Staff"
    Staff getStaffById(Long id); // Change "Doctor" to "Staff"
    Staff updateStaff(Staff staff); // Change "Doctor" to "Staff"
    void deleteStaffById(long id);
    Staff findById(Long id);
}
