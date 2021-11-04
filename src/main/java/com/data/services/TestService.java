package com.data.services;

import java.util.List;

import org.bson.types.ObjectId;

import com.data.Model.Test;

public interface TestService {

	Test editTest(Test test,ObjectId _id);
	
//	List<Test> findTestById();
}
