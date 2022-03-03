package day3.ey;
import java.util.Scanner;

public class pattern {

	public static void main(String[] args) {
		int rows, k = 0, i, j;
		System.out.println("enter rows: ");
		Scanner sc = new Scanner(System.in);
		rows = sc.nextInt();

	    for (i = 1; i <= rows; ++i,k=0) {
	      for (j = 1; j <= rows - i; ++j) {
	        System.out.print("  ");
	      }

	      while (k != 2 * i - 1) {
	        System.out.print("* ");
	        ++k;
	      }

	      System.out.println();
	    }

	}

}
