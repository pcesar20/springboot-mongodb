package com.pc.mongosb.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.pc.mongosb.domain.User;
import com.pc.mongosb.repository.UserRepository;

@Configuration
public class Instance implements CommandLineRunner{
	
	@Autowired
	private UserRepository userRepo;
	
	@Override
	public void run(String... args) throws Exception {
		userRepo.deleteAll();
		
		User paulo = new User(null, "Paulo Cesar", "pc@pcsoft.com.br");
		User thais = new User(null, "Thais Cardoso", "tc@pcsoft.com.br");
		User maria = new User(null, "Maria Brown", "maria@gmail.com");
		User alex = new User(null, "Alex Green", "alex@gmail.com");
		User bob = new User(null, "Bob Grey", "bob@gmail.com");
		
		userRepo.saveAll(Arrays.asList(maria, alex, bob, paulo, thais));

	}

}
