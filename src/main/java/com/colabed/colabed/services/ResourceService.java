package com.colabed.colabed.services;

import org.springframework.stereotype.Service;

import com.colabed.colabed.repositories.ResourceRepository;

@Service
public class ResourceService {

	private ResourceRepository resourceRepository;
	
	public ResourceService(ResourceRepository resourceRepository) {
		this.resourceRepository = resourceRepository;
	}
	
}
