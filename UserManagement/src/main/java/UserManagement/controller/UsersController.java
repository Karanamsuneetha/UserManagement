package UserManagement.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import UserManagement.dto.UserRequestdto;
import UserManagement.dto.UserResponsedto;
import UserManagement.dto.UserUpdateRequestdto;
import UserManagement.service.UserService;

@RestController
public class UsersController {
	private final UserService service;

	public UsersController(UserService service) {
		this.service = service;
	}
	@PostMapping("/register")
	public String register(@RequestBody UserRequestdto user) {
		return service.register(user);
		
	}
	@GetMapping("/searchUser/{id}")
	public UserResponsedto searchUser(@PathVariable Long id) {
		return service.searchUser(id);
	}
	@GetMapping("/viewAllUsers")
	public List<UserResponsedto>viewAllUsers() {
		return service.viewAllUsers();
		
	}
	@PutMapping("/updateUser")
	public UserResponsedto updateUser(@RequestBody UserUpdateRequestdto userDto) {
		return service.updateUser(userDto);
	}
	
	@DeleteMapping("/deleteUser/{id}")
	public String deleteUser(@PathVariable Long id) {
		return service.deleteUser(id);
	}
	

}
