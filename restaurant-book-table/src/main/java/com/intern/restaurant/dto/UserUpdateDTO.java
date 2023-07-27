package com.intern.restaurant.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserUpdateDTO {

	@NotNull(message = "Please enter the password")
	@Pattern(regexp = "[A-Za-z0-9!@#$%^&*_]{8,15}", message = "Password must be 8-15 characters in length and can include A-Z, a-z, 0-9, or special characters !@#$%^&*_")
	private String password;
	
	@NotNull(message = "User full name can not be NULL")
	@Pattern(regexp = "[A-Za-z.\\s]+", message = "Enter valid characters in use name")
	private String fullname;
	
	@NotNull(message = "User address can not be NULL")
	private String address;
	
	@NotNull(message = "Please enter the mobile number")
	@Pattern(regexp = "0{1}[1-9]{1}[0-9]{8}", message = "Enter valid 10 digit mobile number")
	@Column(unique = true)
	private String mobile;
	
	@NotNull(message = "Please enter the email")
	@Email
	@Column(unique = true)
	private String email;
}
