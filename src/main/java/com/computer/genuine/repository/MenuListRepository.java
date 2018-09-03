package com.computer.genuine.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.computer.genuine.model.MenuList;

/**
 * @author Vishal Chhetri
 *
 */
@Repository
public interface MenuListRepository extends JpaRepository<MenuList, Long>{

}
