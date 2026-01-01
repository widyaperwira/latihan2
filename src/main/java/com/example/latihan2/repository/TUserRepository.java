package com.example.latihan2.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.latihan2.domain.TUser;

@Repository
public interface TUserRepository extends JpaRepository<TUser, String>{
	
	Optional<TUser> findAllUserByUsername(String username);

}
