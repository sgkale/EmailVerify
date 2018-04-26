package com.scb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.scb.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

	User findById(int id);
	User findByThaiId(int thaiId);
	User findByEmail(String email);
}
