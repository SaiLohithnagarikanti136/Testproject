package day2ey;

public class Ifternary {

	public static void main(String[] args) {
		int transaction = 4;
		if(transaction<=5) {
			System.out.println("ok");
		}
		
		else if(transaction > 5 && transaction < 10){
			System.out.println("notifying the user");
		}
		
		else {
			System.out.println("warning, ur account has unusual activity");
		}
	}

}
