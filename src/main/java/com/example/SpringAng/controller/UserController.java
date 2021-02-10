package com.example.SpringAng.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringAng.model.User;
import com.example.SpringAng.repository.UserRepository;



@RestController
@RequestMapping("/api")
public class UserController {

	@Autowired
	private UserRepository userRepository;
	
	@PostMapping("/adduser")
	public User createDept(@RequestBody User department) {
		userRepository.save(department);
		return department;
	}
	
	@GetMapping("/getusers")
	public List<User> getAllUsers() {
		  List<User> users = userRepository.findAll();
		   
	return users;
	}
	
	@GetMapping("/getuser/{name}")
	public User getUser(@PathVariable String name)
	{
		List<User> user = userRepository.findAll();
		User matcheuser = null;
		for(User x: user)
		{
			if(x.getName().equalsIgnoreCase(name))
			{
				matcheuser= x;
			}
		}
		return matcheuser;
		
	}
	
	@PutMapping("/updateuser")
	public User updateUser(@RequestBody User user)
	{
		
		userRepository.save(user);
		return user;
		
	}
}





