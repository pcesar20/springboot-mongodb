package com.pc.mongosb.resource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pc.mongosb.domain.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	@GetMapping
	public ResponseEntity<List<User>> findAll() {
		User paulo = new User("1", "Paulo César", "pc@pc.com.br");
		User thais = new User("2", "Thais Rocha", "thais@pc.com.br");
		List<User> list = new ArrayList<>();
		list.addAll(Arrays.asList(paulo, thais));
		return ResponseEntity.ok().body(list);
	}
}
