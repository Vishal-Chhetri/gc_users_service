package com.computer.genuine.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.computer.genuine.model.UserRoles;

/**
 * @author Vishal Chhetri
 *
 */

@Repository
public interface UserRolesRepository extends JpaRepository<UserRoles, Long>{

}
