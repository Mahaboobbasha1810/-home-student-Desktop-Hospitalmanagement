package com.lifecare.Lifecare.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.lifecare.Lifecare.entity.Staff;

@Repository
public interface StaffRepository extends JpaRepository<Staff, Long> { // Change "DoctorRepository" to "StaffRepository"

    @Query("SELECT s FROM Staff s WHERE s.id > :staffId ORDER BY s.id") // Change "Doctor" to "Staff"
    List<Staff> findStaffWithIdGreaterThanOrderByID(@Param("staffId") Long id); // Change "Doctor" to "Staff"

}
