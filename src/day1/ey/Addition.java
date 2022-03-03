package day1.ey;

public class Addition {

	public static void main(String[] args) {
		Addition obj = new Addition();
		int sum = obj.sum(12, 22);
		int subt = obj.subt(27, 22);
		System.out.println("so together the sum and subtraction is --> " + sum + " " + subt);
		int multi = obj.multi(5, 4);
		int divi = obj.divi(10,  5);
		System.out.println("here we go all!! --> " + sum + " " + subt + " " + multi + " " + divi);
		

	}
	
	public int sum(int x, int y) {
		int result = x + y;
		return result;
	}
	
	public int subt(int x, int y) {
		int result = x - y;
		return result;
	}
	
	public int multi(int x, int y) {
		int result = x * y;
		return result;
	}
	
	public int divi(int x, int y) {
		int result = x / y;
		return result;
	}

}
