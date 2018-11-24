package com.colabed.colabed.repositories;

import org.springframework.data.repository.CrudRepository;

import com.colabed.colabed.models.Resource;

public interface ResourceRepository extends CrudRepository<Resource, Long> {

}
