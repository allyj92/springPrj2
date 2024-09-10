package com.example.demo.lombok;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BookTest {
	@Test
	public void 롬복테스트2(){
	Book book1 = new Book();
	Book book2 = new Book("개미",3000,"민음사",200);

	
	book1.setPages(10);
	book1.setPrice(9000);
	book1.setPublish("민음사");
	book1.setTitle("나무");
	
	System.out.println(book1.toString());
	System.out.println(book2.toString());
	
	Book book3 = Book
			.builder()
			.title(null)
			.price(5000)
			.publish(null)
			.pages(0)
			.build() ;
	System.out.println(book3);
	}
	
	
}
