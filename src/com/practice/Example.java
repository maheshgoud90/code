package com.practice;

import java.util.Date;

public class Example {
	public static void main(String[] args) {
		System.out.println(java.time.LocalTime.now());  
		System.out.println(java.time.LocalDateTime.now());  
		Date date=java.util.Calendar.getInstance().getTime();  
		System.out.println(date);   
	}
 
}
