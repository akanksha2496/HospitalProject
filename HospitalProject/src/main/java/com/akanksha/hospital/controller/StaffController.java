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

import com.akanksha.hospital.model.Staff;
import com.akanksha.hospital.services.StaffServices;

@RestController
@RequestMapping("/Staff")
public class StaffController {
	
	@Autowired
	StaffServices staffservices;
	
	@PostMapping("/save")
	public Staff save(@RequestBody Staff staf) {
		Staff staff=staffservices.saveStaff(staf);
		return staff;
	}
	@GetMapping("/getStaff/{id}")
	public Optional<Staff> getEmployeeById(@PathVariable Long id) {
		Optional<Staff> staff=staffservices.getStaff(id);
		return staff;
	}
	
	@GetMapping("/getStaffs")
	public Iterable<Staff> getStaffs() {
		Iterable<Staff> staff=staffservices.getStaffs();
		return staff;
	}
	
	@DeleteMapping("/deleteStaff/{id}")
	public String deleteById(@PathVariable Long id){
		staffservices.deleteStaff(id);
		return id+" is deleted.";
	}
	
	@DeleteMapping("/deleteStaffs")
	public String deleteAll(){
		staffservices.deleteAllStaffs();
		return "Delete All Data";
	}
	

}
