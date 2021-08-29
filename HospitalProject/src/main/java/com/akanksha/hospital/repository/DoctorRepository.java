package com.akanksha.hospital.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.akanksha.hospital.model.Doctor;

@Repository
public interface DoctorRepository extends CrudRepository<Doctor, Long> {

}
