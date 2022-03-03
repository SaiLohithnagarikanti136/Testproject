package day9.ey;

import java.util.Scanner;

public class NoTry {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First Number: ");
		int a =sc.nextInt();
		System.out.println("Enter the Second Number: ");
		int b = sc.nextInt();
		int result = a/b;
		System.out.println("After division " + result);
		System.out.println("After exception");
		method();

	}
	
	private static void method() {
		System.out.println("I am here... ");
	}

}
