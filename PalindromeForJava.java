package com.SelfPraticeJava;

import java.util.Scanner;

public class PalindromeForJava {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str=sc.next();
		String original=str;
		String reverse="";
		StringBuffer sb=new StringBuffer(str);
		sb.reverse();
		reverse=sb.toString();
		if(reverse.equalsIgnoreCase(original)) 
			System.out.println("PALINDROME");
		else 
			System.out.println("NOT PALINDROME");		
	}

	}


