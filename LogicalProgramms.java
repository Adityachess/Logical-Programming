package com.bridgelabz.logicalp;

public class LogicalProgramms {

	public static void main(String[] args) {

		int a = 0, b = 1;
		int temp;

		for (int i = 1; i <= 10; i++) {
			temp = a + b;
			System.out.println(temp);
			a = b;
			b = temp;
		}

	}

}
