package com.practice;

import java.util.Scanner;

public class ScannerExample {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		 
		System.out.println("Enter First Sentance");
		String a=sc.nextLine();
		
		System.out.println("Enter Search Term:");
		String search = sc.nextLine();
		
		System.out.println("Enter Replace Sentance:");
		String replace = sc.nextLine();
		
		String result = a.replace(search, replace);
                                                                                                    
		System.out.println("Result = " + result);

		 

}
}