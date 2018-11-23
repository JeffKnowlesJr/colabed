package com.colabed.colabed.models;

import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tags")
public class Tag {

	@ManyToMany(mappedBy="tags")
	private Set<Subject> getSubjects() { return subjects; }
	
}
