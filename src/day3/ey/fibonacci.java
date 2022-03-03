package day3.ey;

import java.util.Scanner;

public class fibonacci {

	public static void main(String[] args) {
		int fn1=0, fn2=1,i;
		int n;
		System.out.println("Enter how many numbers are needed in Fibonacci series:");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		for(i=1;i<=n;++i) {
			System.out.println(fn1 + " ");
			int fn = fn1 + fn2;
			fn1 = fn2;
			fn2 = fn;
		}
		
	}

}
