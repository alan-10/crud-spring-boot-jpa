package com.crudProject.crud.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.crudProject.crud.entities.User;
import com.crudProject.crud.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig  implements CommandLineRunner{
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
	
		User user1 = new User(null, "alan1", "alan@gmail.com", "989887t22", "12345");
		User user2 = new User(null, "pablo", "pabloviadinho@gmail.com", "98988733", "12345");
		
		userRepository.saveAll(Arrays.asList(user1, user2));
		
	}

	
	
	
}
