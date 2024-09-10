package com.example.demo.di;

import org.springframework.stereotype.Component;

@Component
public class Employee {
	public String work() {
		return "회사원이 일을 한다";
	}
}
