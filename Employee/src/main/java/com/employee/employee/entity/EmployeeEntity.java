package com.employee.employee.entity;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import jakarta.persistence.*;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="Employee")
public class EmployeeEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	


	
	@Column(nullable=false)
	private String firstName;
	
	@Column(nullable=false)
	private String lastName;
	
	@Column(nullable=false)
	private String email;
	
	@Column(nullable=false)
	private String dob;  
	
	@Column(nullable=false)
	private String gender;
	
	@Column(nullable=false)
	private String education;
	
	@Column(nullable=false)
	private String company;
	
	@Column(nullable=false)
	private Long experience;
	
	@Column(nullable=false)
	private Long packagee;
	
}
