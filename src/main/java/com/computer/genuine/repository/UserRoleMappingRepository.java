package com.computer.genuine.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.computer.genuine.model.UserRoleMapping;

public interface UserRoleMappingRepository extends JpaRepository<UserRoleMapping, Long> {

}
