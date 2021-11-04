package com.data.Model;


import java.time.LocalDate;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "test")
public class Test {

	@Id
	private ObjectId _id;
	private String name;
	private LocalDate dob; //2021-01-03
	
	public Test() {
		super();
	}

	
	public Test(ObjectId _id, String name, LocalDate dob) {
		super();
		this._id = _id;
		this.name = name;
		this.dob = dob;
	}


	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public Test(ObjectId _id, String name) {
		super();
		this._id = _id;
		this.name = name;
	}

	public ObjectId get_id() {
		return _id;
	}

	public void set_id(ObjectId _id) {
		this._id = _id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
