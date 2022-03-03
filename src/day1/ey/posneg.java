package day1.ey;

public class posneg {
	public static void main(String[] args) {
		posneg obj=new posneg();
		int a =Integer.parseInt(args[0]);
		obj.positiveNegative(a);
		
	}
	
	public void positiveNegative(int a) {
		if(a>0) {
			System.out.println(a+" is Positive");
		}
		else if(a==0) { 
				System.out.println(a + "is neither Positive nor Negative");
		}
		else {
			System.out.println(a+" is Negative");
		}
	}
		

}
