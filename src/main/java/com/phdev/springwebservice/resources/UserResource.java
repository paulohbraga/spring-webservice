package com.phdev.springwebservice.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.phdev.springwebservice.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<User> findAll(){
		
		User user = new User(1L, "Paulo", "paulo@someletras.com.br", "3348-3300", "12345");
		
		return ResponseEntity.ok().body(user);
		
	}

}
