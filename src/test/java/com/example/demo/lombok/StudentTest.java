package com.example.demo.lombok;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class StudentTest {
	@Test
	public void 롬복테스트() {
		Student student1 = new Student();
		student1.setId(1);
		student1.setName("도우너");
		student1.setAge(7);
		
		System.out.println(student1);
		
		Student student2 = new Student(2,"또치",9);
		System.out.println(student2.toString());
		
		Student student3 = Student
				.builder()
				.id(3)
				.name("둘리")
				.age(9)
				.build();
		System.out.println(student3);
	}

}
