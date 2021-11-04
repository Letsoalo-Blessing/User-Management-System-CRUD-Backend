package com.data.implement;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.data.Model.Test;
import com.data.Repository.TestRepository;
import com.data.services.TestService;

@Transactional
@Component
public class TestServiceImpl implements TestService{

	@Autowired
	private TestRepository testRepository;
	
	@Override
	public Test editTest(Test test, ObjectId _id) {
		
		Test testExit= testRepository.findById(_id).orElse(null);
		testExit.setName(test.getName());
		testExit.setDob(test.getDob());
		
		return testRepository.save(testExit);
	}
	
//	@Override
//	public Test findTestById(ObjectId _id) {
//		
//		return testRepository.findById(id).orElse(null);
//	}
}
