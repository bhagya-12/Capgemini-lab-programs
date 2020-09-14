package com.capg.otms.user.controller;


	import java.util.List;
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.RestController;
	import com.capg.otms.user.model.User;
	import com.capg.otms.user.service.IUserService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

	@RestController
	@CrossOrigin(origins = "http://localhost:4200")
	public class UserController {
		@Autowired
		IUserService service;
		 @HystrixCommand(fallbackMethod="whengetnotwork") 

		@GetMapping("/users/all")
		public List<User> getAllUsers() {
			return service.getAllUsers();
		}
		 public List<User> whengetnotwork() {
			  return null;
		  }
	}