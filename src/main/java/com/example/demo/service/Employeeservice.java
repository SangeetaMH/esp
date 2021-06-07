package com.example.demo.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Department;
import com.example.demo.entity.Employee;
import com.example.demo.repository.Departmentrepository;
import com.example.demo.repository.Employeerepository;

@Transactional
@Service
public class Employeeservice {
	@Autowired
	private Employeerepository repo;
	@Autowired
	private Departmentrepository dep;
	
	public Employee AddEmployee(Employee emp) throws InvaliddataException
	{
		boolean check=validation(emp);
		if(check==true)
		{
		repo.save(emp);	
		}
		else {
			throw new InvaliddataException("Enter valid data");
		}
		return emp;
	}
  public boolean validation(Employee emp) {
	
	  if(emp.getDesignation().equals("manager")&& (emp.getSalary()<100000)&& (emp.getPassport().equals("yes")))
			  {
		  return true;
			  }
	  else  if(emp.getDesignation().equals("sr software engineer")&& (emp.getSalary()<50000)&& (emp.getPassport().equals("yes")))
	  {
		  return true;
	  }
	  else if(emp.getDesignation().equals("software engineer")&& (emp.getSalary()>30000 && emp.getSalary()<50000)&& (emp.getPassport().equals("yes")))
	  {
		  return true;
	  }
	  else if(emp.getDesignation().equals("trainee")&& (emp.getSalary()>20000 && emp.getSalary()<30000)&& (emp.getPassport().equals("yes")))
	  {
		  return true;
	  }
	  return false;
  }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}





























//public Employee addEmployee(Employee emp, int id) throws Invaidsalary, InvaliddataException {
//	Department d = dep.findById(id).get();
//	{
//		if (emp.getDesignation().equals("manager") && emp.getSalary() > 1000000) {
//			throw new Invaidsalary("add salary below than this");
//		} else if (emp.getDesignation().equals("senior software engineer") && emp.getSalary() > 50000) {
//
//			throw new Invaidsalary("add salary below than this");
//		} else if (emp.getDesignation().equals("software engineer")
//				&& (emp.getSalary() < 30000 || emp.getSalary() > 50000)) {
//			throw new Invaidsalary("add new Salary below than this");
//		}
//
//		else if (emp.getDesignation().equals("trainer") && (emp.getSalary() < 20000 || emp.getSalary() > 30000)) {
//
//			throw new Invaidsalary("add new salary than this");
//		}
//		
//		
//		if (emp.getDep() == null) {
//		//	System.out.println(emp.getDep());
//			
//			emp.setDep(d);
//			repo.save(emp);
//		} else {
//
//			throw new InvaliddataException("exception");
//
//		}
//		return emp;
////	}
//
//}
