package UserManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import UserManagement.entity.User;

public interface UsersRepository extends JpaRepository<User, Long>{
	boolean existsByUsername(String username);

    boolean existsByEmail(String email);

    boolean existsByMobile(String mobile);
	
}
