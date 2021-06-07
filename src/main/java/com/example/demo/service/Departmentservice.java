package com.example.demo.service;


import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Department;
import com.example.demo.entity.Employee;
import com.example.demo.repository.Departmentrepository;
import com.example.demo.repository.Employeerepository;
@Transactional
@Service
public class Departmentservice {
	@Autowired
    private Departmentrepository repo;
	@Autowired
	private Employeerepository repo1;
	
	public Department addDepartment(Department dep,int id) throws InvalidException 
	{
		Employee emp=repo1.findById(id).get();
			if(emp.getDep()==null)
		{
			dep.getEmp().add(emp);
			emp.setDep(dep);
			repo.save(dep);
			
		}
		else {
			throw new InvalidException("cannot assign multiple department to one employee");
		}
		return dep;
		
		
	}
	public void upadtedepartment(Department dep,int id)
	{
		Department d =repo.findById(id).get();
		d.setDname(dep.getDname());
	}
	public void deletedepartment(int id)
	{
		repo.deleteById(id);
	}
	public List<Department> getalldepartment()
	{
		return repo.findAll();
	}
	

}
