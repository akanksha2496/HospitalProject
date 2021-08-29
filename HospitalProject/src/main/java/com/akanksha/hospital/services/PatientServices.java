package com.akanksha.hospital.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.akanksha.hospital.model.Patient;
import com.akanksha.hospital.repository.PatientRepository;

@Service
public class PatientServices {
	
	@Autowired
	PatientRepository patientrepository;

	public Patient savePatient(Patient pat) {
		Patient savePatient=patientrepository.save(pat);
		return savePatient;
	}

	public Optional<Patient> getPatient(Long id) {
		Optional<Patient> getpatient=patientrepository.findById(id);
		return getpatient;
	}

	public Iterable<Patient> getPatients() {
		Iterable<Patient> getpatients=patientrepository.findAll();
		return getpatients;
	}

	public void deletePatient(Long id) {
		patientrepository.deleteById(id);
		
	}

	public void deleteAllEmployees() {
		patientrepository.deleteAll();
		
	}

}
