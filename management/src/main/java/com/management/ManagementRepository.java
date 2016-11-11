package com.management;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface ManagementRepository extends MongoRepository<management,String>{

	List<management> findByFirstName(String firstName);
	
	
	
}
