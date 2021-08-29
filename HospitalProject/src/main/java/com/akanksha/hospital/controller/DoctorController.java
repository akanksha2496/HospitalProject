package com.akanksha.hospital.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.akanksha.hospital.model.Doctor;
import com.akanksha.hospital.services.DoctorServices;

@RestController
@RequestMapping("/doctor")
public class DoctorController {
     
	@Autowired
	DoctorServices doctorServices;
	
	@PostMapping("/save")
	public Doctor save(@RequestBody Doctor doc) {
		Doctor Doc= doctorServices.save(doc);
		return Doc;
	}
	 
	@GetMapping("/getDoctors")
	public Iterable<Doctor> getDoctors() {
		Iterable<Doctor> getdoctors=doctorServices.getDoctors();
		return getdoctors;
	}
	@GetMapping("getDoctor/{id}")
	public Optional<Doctor> getDoctor(@PathVariable Long id) {
		Optional<Doctor> getdoctor=doctorServices.getDoctor(id);
		return getdoctor;
	}
	@DeleteMapping("deleteDoctors")
	public void deleteAll() {
		doctorServices.deleteAllDoctors();
	}
	@DeleteMapping("deleteDoctor/{id}")
	public void deleteById(@PathVariable Long id) {
		doctorServices.deleteDoctor(id);
	}
}
