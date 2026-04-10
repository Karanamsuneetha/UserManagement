package UserManagement.controller;

import org.springframework.web.bind.annotation.RestController;

import UserManagement.service.UserService;

@RestController
public class UsersController {
	UserService service;

	public UsersController(UserService service) {
		super();
		this.service = service;
	}
	

}
