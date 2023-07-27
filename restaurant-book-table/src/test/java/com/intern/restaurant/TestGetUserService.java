package com.intern.restaurant;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.time.LocalDateTime;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.intern.restaurant.dto.UserDTO;
import com.intern.restaurant.exception.UserNotFoundException;
import com.intern.restaurant.model.User;
import com.intern.restaurant.service.UserService;

@SpringBootTest
public class TestGetUserService {

	@Autowired
	private UserService userService;
	
	// Test case: No user record in users table in database 
//	@Test
//	public void testGetListUserNoRecord() {
//		assertThatThrownBy(() -> {
//			userService.getAllUser();
//		}).isInstanceOf(UserNotFoundException.class)
//		.hasMessageContaining("No record exists");
//		
//	}
	
	// Test case: Have user record in users table in database
	@Test
	public void testGetListUser() {
//		User user = userService.createUser(new User(1,"luongloi2","123abc","Luong Loi","ha noi", "0987654322",1,LocalDateTime.now(),"No","admin","luongloi2@gmail.com"));
		List<UserDTO> userDto = userService.getAllUser();
		for (UserDTO result : userDto) {
			System.out.println(result.toString());
		}
		assertThat(userDto).isNotNull();
	}
	
	@Test
	public void testGetByEmail() {
		assertThat(userService.getUserByEmail("luongloi@gmail.com")).isNotNull();
		assertThat(userService.getUserByEmail("nguyenvanb@gmail.com")).isNull();
	}
}
