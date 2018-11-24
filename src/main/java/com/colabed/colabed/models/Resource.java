package com.colabed.colabed.models;

import java.time.LocalDateTime;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.validation.Valid;
import javax.validation.constraints.Size;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
public class Resource {

    // Many-to-Many association (Owner)
	
	@ManyToMany
	@JoinTable(name="resource_tag")
	private Set<Tag> tags;
	
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
	
	public Resource() {}
	
	public Set<Tag> getTags() {
		return tags;
	}

	public void setTags(Set<Tag> tags) {
		this.tags = tags;
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
	
}
