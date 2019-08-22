package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;
import com.example.demo.service.HomeService;
/*
 * 
 * basic crud operation using spring boot 
 * adding, udating, deleting user to list
 */
@RestController
@RequestMapping("/home")
public class HomeController {

	@Autowired
	HomeService homeService;
	
	@RequestMapping("/hi")
	public String sayHi() {
		return "Hello from controller";
	}
	
	@RequestMapping("/add/{parm}")
	public String paramAdd(@PathVariable ("parm") String name) {
		return "Hello from controller "+name;
	}
	
	@PostMapping(value = "/addUser",  consumes = "application/json", produces = "application/json")
	public void addUser(@RequestBody User user) {
		homeService.addUser(user);
	}
	
	@GetMapping("/users")
	public List<User> getList(){
		return homeService.getUsers();
	}
	@DeleteMapping("/delete/{id}")
	public void deleteId(@PathVariable ("id") String id) {
		homeService.deleteUser(Integer.parseInt(id));
	}
	
	@PutMapping(value = "/update",  consumes = "application/json", produces = "application/json")
	public void updateUser(@RequestBody User user) {
		homeService.updateUser(user);
	}
}
