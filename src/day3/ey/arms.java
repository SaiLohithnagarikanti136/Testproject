package day3.ey;
import java.util.Scanner;
import java.lang.*;

public class arms {

	public static void main(String[] args) {
		int num; 
		double reminder, sum=0;
		int temp;
		System.out.println("Enter number:- ");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		temp = num;
		while(temp != 0) {
			reminder = temp % 10;
			sum += Math.pow(reminder, 3);
			temp /= 10;
		}
		if(sum == num) {
			System.out.println(num + " " + "is Armstrong");
		}
		
		else {
			System.out.println(num + " " + "isn't Armstrong");
		}

	}

}
