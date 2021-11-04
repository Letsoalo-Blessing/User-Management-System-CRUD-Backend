package com.data.Model;

import java.time.LocalDate;
import java.util.*;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;




@Document(collection = "users")
public class User {
  @Id
  private ObjectId id;

  @NotBlank
  @Size(max = 20)
  private String username;

  @NotBlank
  @Size(max = 50)
  @Email
  private String email;

  @NotBlank
  @Size(max = 120)
  private String password;
  
  @NotBlank
	@Size(max=10)
	private String title;
	
  private LocalDate birthdate; //2021-01-03

  @DBRef
  private Set<Role> roles = new HashSet<>();

  public User() {
  }

  
public User(String username, String email, String password,String title, LocalDate birthdate) {
	super();
	this.username = username;
	this.email = email;
	this.password = password;
	this.title = title;
	this.birthdate = birthdate;
}


//  public User(String username, String email, String password) {
//    this.username = username;
//    this.email = email;
//    this.password = password;
//  }
  
  

  public ObjectId getId() {
    return id;
  }

  public void setId(ObjectId id) {
    this.id = id;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }
  
  
  public String getTitle() {
	return title;
}

public void setTitle(String title) {
	this.title = title;
}

public LocalDate getBirthdate() {
	return birthdate;
}

public void setBirthdate(LocalDate birthdate) {
	this.birthdate = birthdate;
}

public Set<Role> getRoles() {
    return roles;
  }

  public void setRoles(Set<Role> roles) {
    this.roles = roles;
  }
}
