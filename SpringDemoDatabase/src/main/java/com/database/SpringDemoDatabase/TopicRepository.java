package com.database.SpringDemoDatabase;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TopicRepository extends CrudRepository<Topic,String>{

	
	// can extend CRUD or JPA repository too 
	
	
	

}
