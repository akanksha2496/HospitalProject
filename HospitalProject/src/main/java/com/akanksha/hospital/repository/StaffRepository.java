package com.akanksha.hospital.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.akanksha.hospital.model.Staff;

@Repository
public interface StaffRepository extends CrudRepository<Staff, Long> {

}
