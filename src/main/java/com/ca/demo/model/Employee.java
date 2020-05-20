package com.ca.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
@Id
@GeneratedValue
	private int id;
	private String name;
	private String address;
	private String dept;
	private Double salary;
	private String contact;
}
