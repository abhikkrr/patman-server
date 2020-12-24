package com.abhi.springdemo.userlogin.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abhi.springdemo.userlogin.entity.ERole;
import com.abhi.springdemo.userlogin.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{
	
	Optional<Role> findByName(ERole name);
	
}
