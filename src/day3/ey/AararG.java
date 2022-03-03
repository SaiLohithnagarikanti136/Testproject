package day3.ey;

public class AararG {

	public static void lohith(int... n) {
		System.out.println("no of args: " + n.length);
		
		for(int i : n)
			System.out.println(i + " ");
		System.out.println();
	}
	public static void main(String[] args) {
		lohith(100);
		lohith(2,3,4);
		lohith();
		
	}

}
