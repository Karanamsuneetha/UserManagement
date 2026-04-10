package UserManagement.service;

import java.util.List;

import UserManagement.dto.UserRequestdto;
import UserManagement.dto.UserResponsedto;
import UserManagement.entity.Users;

public interface UserService{
	String register(UserRequestdto user);
	UserResponsedto searchUser(Long id);
	List<UserResponsedto>viewAllUsers();
	String updateUser(UserRequestdto user);
	String deleteUser(Long id);

}
