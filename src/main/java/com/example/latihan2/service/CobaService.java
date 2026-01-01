package com.example.latihan2.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.latihan2.domain.TUser;
import com.example.latihan2.repository.TUserRepository;

@Service
public class CobaService {
	
	@Autowired
	TUserRepository tUserRepository;
	
	public String changeNameToThisUsername(String username) {
		Optional<TUser> tUser = tUserRepository.findAllUserByUsername(username);
		return tUser.isPresent()?tUser.get().getUsername():"";
	}
	

}
