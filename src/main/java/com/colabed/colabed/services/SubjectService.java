package com.colabed.colabed.services;

import org.springframework.stereotype.Service;

import com.colabed.colabed.repositories.SubjectRepository;

@Service
public class SubjectService {

	private SubjectRepository subjectRepository;
	
	public SubjectService(SubjectRepository subjectRepository) {
		this.subjectRepository = subjectRepository;
	}
	
}
