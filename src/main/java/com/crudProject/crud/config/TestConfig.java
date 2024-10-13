package com.crudProject.crud.config;

import java.time.Instant;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.crudProject.crud.entities.Order;
import com.crudProject.crud.entities.User;
import com.crudProject.crud.repositories.OrderRepository;
import com.crudProject.crud.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig  implements CommandLineRunner{
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private OrderRepository orderRepository;

	@Override
	public void run(String... args) throws Exception {
	
		User user1 = new User(null, "alan1", "alan@gmail.com", "989887t22", "12345");
		User user2 = new User(null, "pablo", "pabloviadinho@gmail.com", "98988733", "12345");
		
		List<User> usersCreated =  userRepository.saveAll(Arrays.asList(user1, user2));
		
		System.out.println("diniz" +usersCreated.get(0));
		
		Order order1 = new Order(null, Instant.parse("2024-08-25T19:55:07Z"), usersCreated.get(0));
		Order order2 = new Order(null, Instant.parse("2024-08-26T20:23:08Z"), usersCreated.get(1));
		Order order3 = new Order(null, Instant.parse("2024-09-22T02:12:01Z"), usersCreated.get(1));
		
		
		orderRepository.saveAll(Arrays.asList(order1, order2, order3));
		
		
	}

	
	
	
}
