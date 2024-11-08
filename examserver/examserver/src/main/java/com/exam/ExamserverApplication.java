package com.exam;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.exam.model.Role;
import com.exam.model.User;
import com.exam.model.UserRole;
import com.exam.service.UserService;

@SpringBootApplication
public class ExamserverApplication implements CommandLineRunner{
	@Autowired
	private UserService userService;

	public static void main(String[] args) {
		SpringApplication.run(ExamserverApplication.class, args);
		System.out.println("Application running on port 8080");
	}
	
	@Override
	public void run(String...args) throws Exception{
		System.out.println("starting code");
		
		//User user=new User();
		//user.setFirstName("Divyani");
		//user.setLastName("Borekar");
		//user.setUsername("Divyani07");
		//user.setPassword("div");
		//user.setEmail("div@gmail.com");
		//user.setProfile("default.png");
		
		
		//Role role1=new Role();
		//role1.setRoleId(07L);
		//role1.setRoleName("ADMIN");
		
		
		//Set<UserRole> userRoleSet=new HashSet<>();
		//UserRole userRole = new UserRole();
		
		//userRole.setRole(role1);
		
		//userRole.setUser(user);
		
		//userRoleSet.add(userRole);
		
		//User user1 =this.userService.createUser(user, userRoleSet);
		//System.out.println(user1.getUsername());
	
	}

}
