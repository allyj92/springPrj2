package com.example.demo.lombok;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MovieTest {
	@Test
	public void 롬복테스트() {
		Movie movie1 = new Movie();
		movie1.setTitle("메트릭스");
		movie1.setDirector("감독1");
		movie1.setOpening("2024-01-02");
		
		System.out.println(movie1.toString());
		
		Movie movie2 = new Movie("그래비티","감독2","2024-3-23");
		System.out.println(movie2);
		
		Movie movie3 = Movie
				.builder()
				.title("조커")
				.director("감독3")
				.opening("2023-09-01")
				.build();
		
		System.out.println(movie3);
		
	}
 
}
