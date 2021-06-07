package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employee;
import com.example.demo.service.Employeeservice;
import com.example.demo.service.InvaliddataException;

@RestController
public class Employeecontroller {
	@Autowired
   private Employeeservice service;
 @PostMapping("/addemployee")
 public Employee addEmployee(@RequestBody Employee emp) throws InvaliddataException 
 {
	return service.AddEmployee(emp);
	 
 }
 
}
