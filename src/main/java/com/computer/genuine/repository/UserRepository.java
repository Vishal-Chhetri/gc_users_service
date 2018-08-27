package com.computer.genuine.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.computer.genuine.model.User;

/**
 * @author Vishal Chhetri
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	
	public List<User> findByUserName(final String userName);
	
	@Transactional
	@Modifying
	@Query("update User set status=0 where user_id =:user_id")	
    public void deactivateUser(@Param("user_id") Long user_id);
	@Transactional
	@Modifying
	@Query("update User set status=1 where user_id =:user_id")	
    public void activateUser(@Param("user_id") Long user_id);
	@Transactional
	@Modifying
	@Query("delete from User where user_id =:user_id")
	public void deleteUser(@Param("user_id") Long user_id);
	
}
