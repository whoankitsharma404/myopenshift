package com.fl.myopenshift;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MyopenshiftApplication {

	@Autowired
	private UserRepostiory userRepostiory;

	@GetMapping("/")
	public String getMessage(){
		return "welcome";
	}

	@PostMapping("/{message}")
	public String saveMessage(@PathVariable String message){
		userRepostiory.save(User.builder().name(message).build());
		return "Your message "+message+" is saved successfully!!";
	}

	public static void main(String[] args) {
		SpringApplication.run(MyopenshiftApplication.class, args);
	}

}
