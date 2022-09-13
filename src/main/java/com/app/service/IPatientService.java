package com.app.service;

import java.util.List;

import com.app.pojos.Patient;

public interface IPatientService {
	
	List<Patient> createPatients();
	
	List<Patient> getAllpatients();
	
	void deletePatient(Long Id);
	
	Patient getUserByEmailId (String email);
	
}
