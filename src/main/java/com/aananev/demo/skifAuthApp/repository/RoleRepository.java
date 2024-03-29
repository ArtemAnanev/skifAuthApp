package com.aananev.demo.skifAuthApp.repository;

import com.aananev.demo.skifAuthApp.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {
	Role findByRole(String role);
}
