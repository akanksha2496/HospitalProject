package com.akanksha.hospital.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.akanksha.hospital.model.Doctor;
import com.akanksha.hospital.repository.DoctorRepository;

@Service
public class DoctorServices {

	@Autowired
	DoctorRepository doctorRepository;
	public Doctor save(Doctor doc) {
		Doctor saveDoctor=doctorRepository.save(doc);
		return saveDoctor;
	}
	public Iterable<Doctor> getDoctors() {
	    Iterable<Doctor> getdoctors=doctorRepository.findAll();
		return getdoctors;
	}
	public Optional<Doctor> getDoctor(Long id) {
	     Optional<Doctor> getdoctor=doctorRepository.findById(id);
		return getdoctor;
	}
	public void deleteAllDoctors() {
	doctorRepository.deleteAll();
	}
	public void deleteDoctor(Long id) {
		doctorRepository.deleteById(id);
		
	}
	
	

}
