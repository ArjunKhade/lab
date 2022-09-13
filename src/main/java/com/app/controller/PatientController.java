package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.app.service.IPatientService;

@Controller
@RequestMapping("/patient")
public class PatientController {
	@Autowired
    private IPatientService service;
	
	@GetMapping("/display")
	public String getAllPatients(Model map)
	{
		System.out.println("in get all patients");
		map.addAttribute("patients", service.getAllpatients());
		return "/patient/display";//AVN : /WEB-INF/views/patient/display.jsp
	}
	
	@DeleteMapping("/{id}")
	public String deletePatientbyId(@PathVariable Long id)
	{
		service.deletePatient(id);
		return "/patient/display";
	}
	
	@GetMapping("/{id}")
	public String getPatientbyId(@PathVariable String email,Model map)
	{
		map.addAttribute("patient_dtls", service.getUserByEmailId(email));
		return "/patient/display";
	}

	
	
}
