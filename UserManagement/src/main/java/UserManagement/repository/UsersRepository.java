package UserManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import UserManagement.entity.Users;

public interface UsersRepository extends JpaRepository<Users, Long>{
	
	
}
