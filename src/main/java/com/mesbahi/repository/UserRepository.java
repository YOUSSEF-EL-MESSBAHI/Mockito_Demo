package com.mesbahi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mesbahi.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	List<User> findByAddress(String address);
}
