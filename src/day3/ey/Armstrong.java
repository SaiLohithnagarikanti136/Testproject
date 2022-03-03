package day3.ey;
import java.util.Scanner;
import java.lang.*;

public class Armstrong {
	 int power(int a, long b)
	    {
	        if( b == 0)
	            return 1;
	        if (b%2 == 0)
	            return power(a, b/2)*power(a, b/2);
	        return a*power(a, b/2)*power(a, b/2);
	    }
	 
	    int order(int a)
	    {
	        int n = 0;
	        while (a != 0)
	        {
	            n++;
	            a = a/10;
	        }
	        return n;
	    }
	 
	    boolean isArmstrong (int a){
	    	
	        int n = order(a);
	        int temp=a, sum=0;
	        while (temp!=0)
	        {
	            int r = temp%10;
	            sum = sum + power(r,n);
	            temp = temp/10;
	        }
	 
	        return (sum == a);
	    }
	 
	    public static void main(String[] args)
	    {
	        Armstrong ob = new Armstrong();
	        int a = 153;
	        System.out.println(ob.isArmstrong(a));
	        a = 1253;
	        System.out.println(ob.isArmstrong(a));
	        a = 9474;
	        System.out.println(ob.isArmstrong(a));
	    }

	}


