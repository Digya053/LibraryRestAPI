package com.management;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class managementcontroller {
	
@Autowired
public ManagementRepository m;

@RequestMapping("/all")
public List<management> all(){
	List<management> l = m.findAll();
	return l;
}
	
	
@RequestMapping("/fn")
public List<management> firstName(@RequestParam(value = "name")String name){
	List<management> l1 =m.findByFirstName(name);
	return l1;
}
  

		
	}


