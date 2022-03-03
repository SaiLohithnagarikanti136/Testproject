package mazenet7;

//You are using Java
import java.util.*;
public class Main
{
 public void divid(int a,int b)
 {
     try
     {
         int c = a/b;
         System.out.println("Result:"+c);
     }
     
     catch(ArithmeticException e)
     {
         System.out.println("Division by zero not allowed!");
     }
 }
 
 public void check(String s)
 {
     try
     {
         s.length();
     }
     
     catch(NullPointerException e)
     {
         System.out.println("name should not be empty!");
     }
 }
 
 // public void check(String s)
 // {
 //     try
 //     {
 //         s.length();
 //     }
     
 //     catch(NullPointerException e)
 //     {
 //         System.out.println("name should not be empty!");
 //     }
 // }
 
 public static void main(String args[])
 {
     Scanner sc = new Scanner(System.in);
     Main m = new Main();
     
     m.divid(5,2);
     String s = "TARUN";
     s = null;
     m.check(s);
 }
}
