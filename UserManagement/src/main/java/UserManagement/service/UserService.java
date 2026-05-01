package UserManagement.service;

import java.util.List;


import UserManagement.dto.UserRequestdto;
import UserManagement.dto.UserResponsedto;
import UserManagement.dto.UserUpdateRequestdto;
import UserManagement.entity.User;

public interface UserService{
	String register(UserRequestdto user);
	UserResponsedto searchUser(Long id);
	List<UserResponsedto>viewAllUsers();
    UserResponsedto updateUser(UserUpdateRequestdto userDto);
	String deleteUser(Long id);

}
