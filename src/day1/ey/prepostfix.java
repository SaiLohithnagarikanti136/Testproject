package day1.ey;

public class prepostfix {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = ++a;
		int d = a + b + c;
		int e = b++;
		int sum = d + e;
		System.out.println("c is - "+ sum);
	}
	

}
