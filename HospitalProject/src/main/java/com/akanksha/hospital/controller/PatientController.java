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

import com.akanksha.hospital.model.Patient;
import com.akanksha.hospital.services.PatientServices;

@RestController
@RequestMapping("/patient")
public class PatientController {

	@Autowired
	PatientServices patientServices;
	
	@PostMapping("/save")
	public Patient save(@RequestBody Patient Pat) {
		Patient patient= patientServices.savePatient(Pat);
		return patient;
	}
	
	@GetMapping("/getPatient/{id}")
	public Optional<Patient> getPatient(@PathVariable Long id) {
		Optional<Patient> getpatient=patientServices.getPatient(id);
		return getpatient;
		
	}
	@GetMapping("/getPatients")
	public Iterable<Patient> getPatients() {
		Iterable<Patient> getpatients= patientServices.getPatients();
		return getpatients;
	}
    
	@DeleteMapping("/deletePatient/{id}")
	public String deleteById(@PathVariable Long id){
		patientServices.deletePatient(id);
		return id+" is deleted.";
	}
	@DeleteMapping("/deletePatients")
	public String deleteAll(){
		patientServices.deleteAllEmployees();
		return "Delete All Data";
	}
}
