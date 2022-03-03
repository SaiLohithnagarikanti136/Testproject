package mazenet7;
import java.util.*;
public class Stacky {
	public static void main(String args[]){
	Stack<String> a = new Stack<>();
	a.add("Lohith");
	a.add("abdul");
	a.add("mathwik");
	a.add("varun");
	a.add("laharish");
	a.pop();
	a.push("karthik");
	Iterator iter = a.iterator();
	while(iter.hasNext()){
	System.out.println(iter.next());
}
	}
}
