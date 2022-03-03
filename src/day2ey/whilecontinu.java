package day2ey;

import java.util.Scanner;

public class whilecontinu {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		while(true) {
			System.out.println("enter your desired number: ");
			n = sc.nextInt();
			if(n % 2 == 0) {
				System.out.println("not an odd number");
				continue;
			}
			else {
				break;
			}
		}
		sc.close();
		System.out.println("entered number is odd -> " + n);

	}

}
