package com.crudProject.crud.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crudProject.crud.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	@GetMapping("/all")
	public ResponseEntity<User> findAll() {
		User user = new User(1L, "alan", "alan@gmail.com", "099898989", "12334555");

		return ResponseEntity.ok().body(user);
	}

}
