package mazenet7;
import java.util.*;

public class Arraylist {

	public static void main(String[] args) {
		List<String> a = new ArrayList<>();
	    a.add("Lohith");
		a.add("abdul");
		a.add("mathwik");
		a.add("varun");
		a.add("laharish");
		Iterator iter = a.iterator();
		while(iter.hasNext()){
		System.out.println(iter.next());
	}

}
}
