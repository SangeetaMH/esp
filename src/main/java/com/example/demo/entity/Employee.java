package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "Employee")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int id;
	@Column(name = "ename")
	private String name;
	@Column(name = "age")
	private int age;
	@Column(name = "salary")
	private double salary;
	@Column(name = "managername")
	private String managername;
	private String designation;
	private String passport;
	@ManyToOne(fetch = FetchType.LAZY)
	@JsonIgnore
	private Department dep;


	public Employee(int id, String name, int age, double salary, String managername, String designation,
			String passport, Department dep) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.managername = managername;
		this.designation = designation;
		this.passport = passport;
		this.dep = dep;
	}
   public Employee() {
		super();
	}

	public Department getDep() {
		return dep;
	}

	public void setDep(Department dep) {
		this.dep = dep;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getManagername() {
		return managername;
	}

	public void setManagername(String managername) {
		this.managername = managername;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getPassport() {
		return passport;
	}

	public void setPassport(String passport) {
		this.passport = passport;
	}

}
