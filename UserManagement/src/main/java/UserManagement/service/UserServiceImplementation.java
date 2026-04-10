package UserManagement.service;

import org.springframework.stereotype.Service;

import UserManagement.repository.UsersRepository;

@Service
public class UserServiceImplementation implements  UserService{
	
	UsersRepository repo;

	public UserServiceImplementation(UsersRepository repo) {
		super();
		this.repo = repo;
	}
	

}
