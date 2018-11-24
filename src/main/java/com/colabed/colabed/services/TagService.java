package com.colabed.colabed.services;

import org.springframework.stereotype.Service;

import com.colabed.colabed.repositories.TagRepository;

@Service
public class TagService {

	private TagRepository tagRepository;
	
	public TagService(TagRepository tagRepository) {
		this.tagRepository = tagRepository;
	}
}
