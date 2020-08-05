package com.pc.mongosb.config;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.TimeZone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.pc.mongosb.domain.Post;
import com.pc.mongosb.domain.User;
import com.pc.mongosb.dto.AuthorDTO;
import com.pc.mongosb.repository.PostRepository;
import com.pc.mongosb.repository.UserRepository;

@Configuration
public class Instance implements CommandLineRunner {

	@Autowired
	private UserRepository userRepo;

	@Autowired
	private PostRepository postRepo;

	@Override
	public void run(String... args) throws Exception {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		sdf.setTimeZone(TimeZone.getTimeZone("GMT"));
		userRepo.deleteAll();
		postRepo.deleteAll();

		User paulo = new User(null, "Paulo Cesar", "pc@pcsoft.com.br");
		User thais = new User(null, "Thais Cardoso", "tc@pcsoft.com.br");
		User maria = new User(null, "Maria Brown", "maria@gmail.com");
		User alex = new User(null, "Alex Green", "alex@gmail.com");
		User bob = new User(null, "Bob Grey", "bob@gmail.com");

		userRepo.saveAll(Arrays.asList(maria, alex, bob, paulo, thais));

		Post post1 = new Post(null, sdf.parse("21/03/2020"), "Partiu", "Viagem", new AuthorDTO(paulo));
		Post post2 = new Post(null, sdf.parse("21/03/2020"), "Felicidade", "Feliz hoje", new AuthorDTO(paulo));

		postRepo.saveAll(Arrays.asList(post1, post2));
		paulo.getPosts().addAll(Arrays.asList(post1, post2));
		userRepo.save(paulo);

	}

}
