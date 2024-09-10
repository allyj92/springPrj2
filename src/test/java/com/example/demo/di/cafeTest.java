package com.example.demo.di;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class cafeTest {
	@Autowired
	Cafe cafe;
	
	@Autowired
	Manager manager;
	
	@Test
	void 테스트() {
		System.out.println("Cafe: " + cafe);
		System.out.println("Manager: " + manager);
		System.out.println("cafeManager(): " + cafe.manager);
	}

}
