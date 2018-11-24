package com.colabed.colabed.services;

import org.springframework.stereotype.Service;

import com.colabed.colabed.repositories.FieldRepository;

@Service
public class FieldService {

	private FieldRepository fieldRepository;
	
	public FieldService( FieldRepository fieldRepository ) {
		this.fieldRepository = fieldRepository;
	}
	
}

