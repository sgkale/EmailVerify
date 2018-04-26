package com.scb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.scb.entities.VerificationToken;

@Repository
public interface TokenRepository extends JpaRepository<VerificationToken, Integer>{

	public VerificationToken findByToken(String token);
}
