package com.rhinoceros.rhinExpenses.service;

import com.rhinoceros.rhinExpenses.model.User;

public interface UserService {
	public User findUserByEmail(String email);
	public void saveUser(User user);
}
