package com.example.demo.di;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class DogTest {
	
	@Autowired
	Dog dog;
	
	@Test
	void 테스트() {
	  System.out.println(dog);
	  System.out.println(dog.sound());
	}
}
