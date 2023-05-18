package com.imaginnovate.studentproject.model;

import java.util.Date;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class StudentRequest {
	
	@Size(min = 3,message = "name should be more then 3 letter")
	private String firstName;
	@Size(min = 3,message = "name should be more then 3 letter")
	private String lastName;
	@NotNull
	private Date dob;
	@NotNull
	private String gender;
	@NotNull
	private Float mark1;
	@NotNull
	private Float mark2;
	@NotNull
	private Float mark3;

}
