package com.colabed.colabed.models;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.Valid;
import javax.validation.constraints.Email;
import javax.validation.constraints.Size;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
public class User {
	
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Valid
	@Size( min = 1, max = 255, message = "User name must be between 1-255 characters.")
	private String username;
	
	@Valid
	@Email( message = "Invalid email format. Example: example@example.com.")
	@Size( min = 1, message = "Email must be present. Example: example@example.com.")
	private String email;
	
	@Column
	@CreationTimestamp
	private LocalDateTime createDateTime;
	
	@Column
	@UpdateTimestamp
	private LocalDateTime updateDateTime;
	
	public User() {}
	
	
	
}

