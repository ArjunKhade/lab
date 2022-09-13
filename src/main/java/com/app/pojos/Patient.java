package com.app.pojos;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Entity
@Table(name="patients")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Patient {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message = "Name is required")
	private String name;
	
	@NotBlank(message = "email is required")
	@Email(message = "invalid email format")
	@Column(unique=true)
	private String email;
	
	@NotBlank(message = "DOB is required")
	private LocalDate dateOfBirth;
	
	@NotBlank(message = "Contact No is required")
	private Long contactNumber;
	
	@NotBlank(message = "Address is required")

	private String Address;
	
	@Enumerated(EnumType.STRING)
	private BloodGroup bloodGroup;
	
	public Patient(String name, String email, LocalDate dateOfBirth, Long contactNumber, String address,
BloodGroup bloodGroup) {
		super();
		this.name = name;
		this.email = email;
		this.dateOfBirth = dateOfBirth;
		this.contactNumber = contactNumber;
		Address = address;
		this.bloodGroup = bloodGroup;
	}
}
