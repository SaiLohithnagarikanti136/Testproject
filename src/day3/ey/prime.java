package day3.ey;

import java.util.Scanner;

public class prime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter the number so that it prints upto that: ");
		n = sc.nextInt();
		System.out.println("prime nubers are follows:- ");
		
		for(int i=2;i<=n;i++) {
			int k=0;
			for(int j=1;j<=i;j++) {
				if(i%j == 0) {
					k++;
				}
			}
			if(k==2) {
				System.out.println(i + " ");
			}
		}

	}

}
