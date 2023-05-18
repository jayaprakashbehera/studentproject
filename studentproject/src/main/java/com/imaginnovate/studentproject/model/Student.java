package com.imaginnovate.studentproject.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@Column
	@Size(min = 3,message = "name should be more then 3 letter")
	private String firstName;
	@Column
	@Size(min = 3,message = "name should be more then 3 letter")
	private String lastName;
	@Column
	@NotNull
	private Date dob;
	@Column
	@NotNull
	private String section;
	@Column
	@NotNull
	private String gender;
	@Column
	@NotNull
	private Float mark1;
	@Column
	@NotNull
	private Float mark2;
	@Column
	@NotNull
	private Float mark3;
	@Column
	private Float total;
	@Column
	private Float avarage;
	@Column
	private String result;

}
