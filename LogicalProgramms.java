package com.bridgelabz.logicalp;

import java.util.Scanner;

public class LogicalProgramms {

	public static void main(String[] args) {

		int number, sum = 0;
		System.out.println("enter the number:");
		
		Scanner sc = new Scanner(System.in);
		number = sc.nextInt();
		for (int i = 1; i < number; i++) {
			if (number % i == 0) {
				sum = sum + i;
			}
		}
		if (number == sum)
			System.out.println("Number is a perfect Sqarenumber");
		else
			System.out.println("Number is not a perfect Squarenumber");

	}

}
