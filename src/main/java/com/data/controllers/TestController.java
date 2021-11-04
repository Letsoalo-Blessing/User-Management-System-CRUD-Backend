package com.data.controllers;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.data.Model.Test;
import com.data.Repository.TestRepository;
import com.data.services.TestService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/test")
public class TestController {

	
	@Autowired
	private TestRepository testRepository;
	
	@Autowired
	private TestService testService;
	
	//CREATE
	@PostMapping("/addTest")
	Test addTest(@RequestBody Test test) {
		
		return testRepository.save(test);
	}  
	
	//UPDATE
	@PutMapping("/editTest/{_id}")
	Test editTest(@RequestBody Test test,@PathVariable ObjectId _id) {
		
		return testService.editTest(test, _id);
	}
	
	//DELETE
	@DeleteMapping("/deleteTest/{_id}")
	void deleteUser(@PathVariable ObjectId _id) {
		
		testRepository.deleteById(_id);
	}
	
	//READ
	@GetMapping("/getTest")
	public List<Test> getTest(){
		
		return testRepository.findAll();
	}
	
//	@GetMapping("/getTest/{_id}")
//	public Test getTest(@PathVariable ObjectId _id){
//		
//		return testRepository.findById(_id);
//	}
	
}
