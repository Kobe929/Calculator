package org.bildit.calc;

public class Calc {

	public static void main(String[] args) {
		double a = Math.random() * 10;
		double b = Math.random() * 10;
		
		System.out.println(a +" " + b);
		addition(a,b);
		substraction(a,b);
		multiplication(a, b);
		division(a, b);
		squareRoot(a);
		pow(a);

	}

	public static void addition(double a, double b) {

		System.out.println(a + b);
	}

	public static void substraction(double a, double b) {
		System.out.println(a - b);

	}

	public static void multiplication(double a, double b) {
		double c = a * b;

		System.out.println(c);
	}

	public static void division(double a, double b) {

		if (b != 0) {
			double c = a / b;

			System.out.println(c);

		} else {
			System.out.println("Nemoguce dijeliti nulom ");
		}
	}

	public static void squareRoot(double a) {
		System.out.println(Math.sqrt(a));
	}

	public static void pow(double a) {
		System.out.println(Math.pow(a, 2));
	}

}
