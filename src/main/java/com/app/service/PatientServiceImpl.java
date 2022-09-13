package com.app.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.custom_exceptions.ResourceNotFoundException;
import com.app.dao.IPatientDao;
import com.app.pojos.BloodGroup;
import com.app.pojos.Patient;
@Service
@Transactional
public class PatientServiceImpl implements IPatientService {
   @Autowired
   private IPatientDao patientDao;
	
	@Override
	public List<Patient> getAllpatients() {
		return patientDao.findAll();
	}

	@Override
	public void deletePatient(Long Id) {
		Patient patient =patientDao.findById(Id).orElseThrow(()-> new  ResourceNotFoundException("Invalid Id"));
		patientDao.delete(patient);
	}
	
	@Override
	public List<Patient> createPatients() {
	   //String name, String email, LocalDate dateOfBirth, Long contactNumber, String address,
		//BloodGroup bloodGroup
	   List<Patient> list =new ArrayList<>();
		Patient p = new Patient();
		Patient p1 = new Patient();
		
		p.setName("Ram");p.setBloodGroup(BloodGroup.A);p.setAddress("Pune");p.setContactNumber((long) 787845855);p.setEmail("rama@gmail.com");p.setDateOfBirth(LocalDate.now());
		p1.setName("Sham");p1.setBloodGroup(BloodGroup.AB);p1.setAddress("Mumbai");p1.setContactNumber((long) 787845855);p1.setEmail("sham@gmail.com");p1.setDateOfBirth(LocalDate.now());
		list.add(p);
		list.add(p1);
		patientDao.save(p);
		patientDao.save(p1);
		return list;
	}
	@Override
	public Patient getUserByEmailId(String email) {
		Patient patient = this.patientDao.findByEmail(email)
				 .orElseThrow(()-> new  ResourceNotFoundException("Invalid Id"));
		return patient;
	}
	

}
