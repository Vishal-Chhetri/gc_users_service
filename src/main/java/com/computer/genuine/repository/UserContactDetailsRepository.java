package com.computer.genuine.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.computer.genuine.model.UserContactDetails;

/**
 * @author Vishal Chhetri
 *
 */
@Repository
public interface UserContactDetailsRepository extends JpaRepository<UserContactDetails, Long> {

}
