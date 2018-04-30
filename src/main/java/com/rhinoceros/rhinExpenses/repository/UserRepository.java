package com.rhinoceros.rhinExpenses.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.rhinoceros.rhinExpenses.model.User;

public interface UserRepository extends JpaRepository<User,Long> {
	User findByEmail(String email);
}
