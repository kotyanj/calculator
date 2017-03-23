package ru.ugatu.ekaterina.calculator;

import java.util.Scanner;

public class Calculator {

	public static int calc(int a, int b, char op) throws UnsupportedOperationException {

		switch (op) {
		case '+':
			return a + b;
		case '-':
			return a - b;
		case '*':
			return a * b;
		case '/':
			return a / b;
		default:
			throw new UnsupportedOperationException("Unsupported operation: " + op);
		}

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a");
		int a = scanner.nextInt();
		System.out.println("Enter b");
		int b = scanner.nextInt();
		System.out.println("Enter operation (+, -, *, /)");
		char op = scanner.next().charAt(0);
		try {
			int result = calc(a, b, op);
			System.out.println("Result = " + result);
		} catch (UnsupportedOperationException e) {
			System.err.println(e.getMessage());
		}
	}
}
