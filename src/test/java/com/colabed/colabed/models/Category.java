package com.colabed.colabed.models;

import java.util.Set;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

public class Category {

    // One-to-Many association using generics (Owned)
	
    @ManyToOne
    @JoinColumn(name="field_id", nullable=false)
    public Field getfield() { return field; }

    
    // One-to-Many association using generics (Owner)

    @OneToMany(cascade=ALL, mappedBy="category")
    public Set<Subject> getSubjects() { return subjects; }
	
}
