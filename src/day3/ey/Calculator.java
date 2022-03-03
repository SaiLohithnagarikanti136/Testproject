package day3.ey;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Double num1, num2, answer;
		char operator;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your desired operator:- +, -, *, /, % : ");
		operator = sc.next().charAt(0);
		System.out.println("enter num1: ");
		num1 = sc.nextDouble();
		System.out.println("enter num2: ");
		num2 = sc.nextDouble();
		
		switch(operator) {
		case '+':
			answer = num1 + num2;
			System.out.println(num1 + "+" + num2 + "=" + answer);
			break;
			
		case '-' :
			answer = num1 - num2;
			System.out.println(num1 + "-" + num2 + "=" + answer);
			break;
			
		case '*' :
			answer = num1 * num2;
			System.out.println(num1 + "*" + num2 + "=" + answer);
			break;
			
		case '/' :
			answer = num1/num2;
			System.out.println(num1 + "/" + num2 + "=" + answer);
			break;
			
		case '%' :
			answer = num1 % num2;
			System.out.println(num1 + "%" + num2 + "=" + answer);
			break;
			
		default:
			System.out.println("invalid");
			break;
        }
		sc.close();

	}

}
