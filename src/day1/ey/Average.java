package day1.ey;

public class Average {

	public static void main(String[] args) {
		Average obj = new Average();
		int a = 10, b = 20, c = 30, d = 40;
		double avg = obj.avg(a,b,c,d);
		System.out.println("The Average is -->"  + avg);

	}
	
	public double avg(int x, int y, int z, int a) {
		int result = ((x + y + z + a) / 4);
		return result;
	}

}
