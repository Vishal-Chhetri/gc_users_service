package com.computer.genuine.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.computer.genuine.model.User;

/**
 * @author Vishal Chhetri
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	

}
