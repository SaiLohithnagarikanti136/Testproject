package mazenet7;
import java.util.*;
public class Linkedlist {
	public static void main(String args[]){
	List<String> a = new LinkedList<>();
	a.add("Lohith");
	a.add("abdul");
	a.add("mathwik");
	a.add("varun");
	a.add("laharish");
	Iterator iter = a.iterator();
	Collections.reverse(a);
	while(iter.hasNext()){
	System.out.println(iter.next());
	}
}
}
