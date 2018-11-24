package com.colabed.colabed.models;

import java.time.LocalDateTime;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.Valid;
import javax.validation.constraints.Size;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
public class Category {

	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	private Long id;
	
    // One-to-Many association using generics (Owned)
	
    @ManyToOne
    @JoinColumn(name="field_id", nullable=false)
    public Field fields;
    
    // One-to-Many association using generics (Owner)

    @OneToMany(mappedBy="category")
    public Set<Subject> subjects;
    
	@Valid
	@Column
	@Size( min = 1, max = 255, message = "Field name must be between 1-255 characters.")
	private String name;

	@Valid
	@Column
	@Size( min = 1, max = 2000, message = "Idea name must be between 1-2000 characters.")
	private String description;
	
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

	public Field getFields() {
		return fields;
	}

	public void setFields(Field fields) {
		this.fields = fields;
	}

	public Set<Subject> getSubjects() {
		return subjects;
	}

	public void setSubjects(Set<Subject> subjects) {
		this.subjects = subjects;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
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
	
	public Category() {}
	
}
