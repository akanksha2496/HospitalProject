package com.akanksha.hospital.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.akanksha.hospital.model.Staff;
import com.akanksha.hospital.repository.StaffRepository;

@Service
public class StaffServices {

	@Autowired
	StaffRepository staffRepository;
	
	public Staff saveStaff(Staff staf) {
		Staff saveStaff=staffRepository.save(staf);
		return saveStaff;
	}

	public Optional<Staff> getStaff(Long id) {
		Optional<Staff> getStaff=staffRepository.findById(id);
		return getStaff;
	}

	public Iterable<Staff> getStaffs() {
		Iterable<Staff> getstaffs=staffRepository.findAll();
		return getstaffs;
	}

	public void deleteStaff(Long id) {
		staffRepository.deleteById(id);
		
	}

	public void deleteAllStaffs() {
		staffRepository.deleteAll();
		
	}

}
