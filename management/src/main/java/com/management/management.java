package com.management;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "book")
public class management {

	@Id
  private String id;
  private String firstName;
  private String lastName;
  private String bookBorrowed;
  private String description;
  
  
  public management(){}
  
  public management(String id, String firstName, String lastName, String bookBorrowed,String description){
	  this.id = id;
	  this.firstName = firstName;
	  this.lastName = lastName;
	  this.bookBorrowed = bookBorrowed;
	  this.description = description;
	  
  }
  public void setId(String id){
	  this.id = id;
  }
  public void setfirstName(String firstName){
	  this.firstName = firstName;
  }
  public void setlastName(String lastName){
	  this.lastName = lastName;
  }
  public void setbookBorrowed(String bookBorrowed){
	  this.bookBorrowed = bookBorrowed;
	  
  }
  public void setdescription(String description){
	  this.description = description;
  }
  
  public String getId(){
	  return id;
  }
  public String getfirstName(){
	  return firstName;
  }
  public String getlastName(){
	  return lastName;
  }
  public String getbookBorrowed(){
	  return bookBorrowed;
  }
  public String getdescription(){
	  return description;
	  }
  

}
