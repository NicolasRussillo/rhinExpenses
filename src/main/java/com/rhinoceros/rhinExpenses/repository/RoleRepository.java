package com.rhinoceros.rhinExpenses.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.rhinoceros.rhinExpenses.model.Role;

public interface RoleRepository extends JpaRepository<Role,Long> {
	Role findByRole(String role);

}
