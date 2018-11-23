package com.colabed.colabed.models;

import java.util.List;
import java.util.Set;

import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.jeffknowlesjr.greatIdeas.models.Idea;

public class Subject {

    // One-to-Many association using generics (Owned)
	
    @ManyToOne
    @JoinColumn(name="subj_id", nullable=false)
    public Subject getSubject() { return subject; }
    
	@ManyToMany
	@JoinTable(name="subject_tag")
	private Set<Tag> getTags() { return tags; }

}
