package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Department;
import com.example.demo.service.Departmentservice;
import com.example.demo.service.InvalidException;

@RestController
public class Departmentcontroller {
	@Autowired
	private Departmentservice service;
	@PostMapping("/adddepartment{id}")
	private Department AddDepartmentdetials( @RequestBody Department dep,@PathVariable int id) throws InvalidException 
	{
		System.out.println("hii");
		return service.addDepartment(dep, id);
		
	}
	
//	@PutMapping("/update/{id}")
//	private void updatedepartmentdetails(@RequestBody Department dep,@PathVariable int id)
//	{
//		service.upadtedepartment(dep, id);
//	}
//	@GetMapping("/")
//	private List<Department> getAlldeprtment()
//	{
//		return service.getalldepartment();
//		
//	}
//	@DeleteMapping("{id}")
//	private void deletedepartment(@PathVariable int id)
//	{
//		service.deletedepartment(id);
//	}
//	@PostMapping("/add")
//	private Department adddepartmentdetails(@RequestBody Department department)
//	{
//		return service.Adddepartment(department);
//		
//	}

}
