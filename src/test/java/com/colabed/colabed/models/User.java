package com.colabed.colabed.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Transient;
import javax.validation.Valid;
import javax.validation.constraints.Email;
import javax.validation.constraints.Size;

@Entity
public class User {
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Valid
	@Size( min = 1, max = 255, message = "Name must be between 1-255 characters.")
	private String name;
	
	@Email( message = "Invalid email format. Example: example@example.com.")
	@Size( min = 1, message = "Email must be present. Example: example@example.com.")
	private String email;
	
	@Size( min = 1, message = "Password must be at least one character.")
	private String password;
	
	@Size( min = 1, message = "Passwords must match.")
	@Transient
	private String confirmPassword;
	
	@ManyToMany
	@JoinTable(name="user_idea")
	private List<Idea> ideas;
	
	public User() {}
	
}

