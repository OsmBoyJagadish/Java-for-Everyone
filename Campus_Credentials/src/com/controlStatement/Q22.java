package com.controlStatement;

import java.util.Scanner;

public class Q22 {
	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter any character: ");
		 char ch=sc.next().charAt(0);
		 sc.close();
		
		 if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
		 	System.out.println("It is a vowel");
		 }else {
		 	System.out.println("It is a Consonent");
		 }
	}
}
