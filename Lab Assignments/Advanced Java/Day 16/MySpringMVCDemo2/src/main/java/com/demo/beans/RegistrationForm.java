package com.demo.beans;

import java.time.LocalDate;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.multipart.MultipartFile;

public class RegistrationForm {
	@NotBlank private String userId; 
	@NotBlank private String name; 
	private String gender; 
	@Past(message = "DOB must be in the past") 
	@DateTimeFormat(pattern = "yyyy-MM-dd") 
	private LocalDate dob; 
	@NotBlank private String username;
	@NotBlank @Size(min=6) private String password; 
	@NotBlank private String confirmPassword; 
	private String[] skills; // checkboxes 
	private MultipartFile photo;

}
