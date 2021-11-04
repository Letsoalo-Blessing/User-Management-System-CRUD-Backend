package com.data.Repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.data.Model.Test;

@Repository
public interface TestRepository extends MongoRepository<Test, ObjectId>{

	
}
