package com.example.demo.lombok;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CarTest {
	@Test
	public void 롬복테스트3(){
		Car car1 = new Car();
		car1.setName("mini");
		car1.setMade("kia");
		car1.setColor("blue");
		
		System.out.println(car1);
		
		Car car2 = new Car("spark","hyundai","red");
		System.out.println(car2.toString());
		
		Car car3 = Car
					.builder()
					.name("")
					.made("doyota")
					.color("black")
					.build();
		
		System.out.println(car3);
					}

}
