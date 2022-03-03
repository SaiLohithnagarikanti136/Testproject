package day3.ey;

public class Array2d {

	public static void main(String[] args) {
		int rows = 4;
		int columns = 4;
		int [][] numarr = {{1,2,3,4},{5,6,7,8},{1,3,5,7},{2,4,6,8}};
		System.out.println("numarr[0].length");
		System.out.println("numarr[0][2]");
		
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				System.out.println(" " + numarr[i][j]);
			}
			System.out.println();
		}
	}
}
