package com.colabed.colabed.models;

import java.util.Set;

import javax.persistence.OneToMany;

public class Field {
	
	
    // One-to-Many association using generics (Owner)

    @OneToMany(cascade=ALL, mappedBy="field")
    public Set<Category> getCategories() { return categories; }


}
