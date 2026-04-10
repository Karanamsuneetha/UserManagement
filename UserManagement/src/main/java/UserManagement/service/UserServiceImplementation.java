package UserManagement.service;

import java.util.List;

import org.springframework.stereotype.Service;

import UserManagement.dto.UserRequestdto;
import UserManagement.dto.UserResponsedto;
import UserManagement.repository.UsersRepository;

@Service
public class UserServiceImplementation implements  UserService{
	
	UsersRepository repo;

	public UserServiceImplementation(UsersRepository repo) {
		super();
		this.repo = repo;
	}

	@Override
	public String register(UserRequestdto user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserResponsedto searchUser(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UserResponsedto> viewAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateUser(UserRequestdto user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteUser(Long id) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
