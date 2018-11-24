package com.colabed.colabed.models;

import java.time.LocalDateTime;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.Valid;
import javax.validation.constraints.Size;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name = "tags")
public class Tag {

	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	private Long id;
	
    // Many-to-Many association (Owned)
	
	@ManyToMany(mappedBy="tags")
	private Set<Subject> subjects;
	
    // Many-to-Many association (Owned)
	
	@ManyToMany(mappedBy="tags")
	private Set<Resource> resources;

	@Valid
	@Column
	@Size( min = 1, max = 255, message = "Field name must be between 1-255 characters.")
	private String name;
	
	@Column
	@CreationTimestamp
	private LocalDateTime createDateTime;
	
	@Column
	@UpdateTimestamp
	private LocalDateTime updateDateTime;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDateTime getCreateDateTime() {
		return createDateTime;
	}

	public void setCreateDateTime(LocalDateTime createDateTime) {
		this.createDateTime = createDateTime;
	}

	public LocalDateTime getUpdateDateTime() {
		return updateDateTime;
	}

	public void setUpdateDateTime(LocalDateTime updateDateTime) {
		this.updateDateTime = updateDateTime;
	}

	public Set<Subject> getSubjects() {
		return subjects;
	}

	public void setSubjects(Set<Subject> subjects) {
		this.subjects = subjects;
	}

	public Set<Resource> getResources() {
		return resources;
	}

	public void setResources(Set<Resource> resources) {
		this.resources = resources;
	}
	
	public Tag() {}
	
}
