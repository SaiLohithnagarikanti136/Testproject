package day1.ey;

public class twovar {

	public static void main(String[] args) {
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		if(num1>num2) {
			System.out.println("num1 is large");
		}
		else if(num1<num2) {
			System.out.println("num1 is smaller ");
		}
		else {
			System.out.println("both are equal");
		}
		

	}

}
