package com.computer.genuine.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.computer.genuine.model.MenuRoleMap;

/**
 * @author Vishal Chhetri
 *
 */
@Repository
public interface MenuRoleMapRepository extends JpaRepository<MenuRoleMap, Long> {

}
