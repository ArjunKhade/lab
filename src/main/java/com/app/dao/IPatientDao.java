package com.app.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.pojos.Patient;

public interface IPatientDao extends JpaRepository<Patient, Long> {

	Optional<Patient> findByEmail(String email);
	
}
