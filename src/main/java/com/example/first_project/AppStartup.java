package com.example.first_project;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class AppStartup implements CommandLineRunner , ApplicationRunner {

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
	 System.out.println("command line runner");	
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		// TODO Auto-generated method stub
		 System.out.println("command After line runner");	
	}

}
