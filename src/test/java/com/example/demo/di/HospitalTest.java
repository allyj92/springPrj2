package com.example.demo.di;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class HospitalTest {
	
	@Autowired
	Hospital hospital;
	@Autowired
	Doctor doctor;
	
	
	@Test
	void 테스트() {
		System.out.println("Hospital: " + hospital);
		System.out.println("Doctor: " + doctor);
		System.out.println("Hospital Doctor: " + hospital.doctor);
	}

}
