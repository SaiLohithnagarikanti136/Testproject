package mazenet7;
import java.util.*;
public class Hashy {
		public static void main(String args[]){
		HashSet<String> a = new HashSet<>();
		a.add("Lohith");
		a.add("abdul");
		a.add("mathwik");
		a.add("varun");
		a.add("laharish");
		a.add("Lohith");
		Iterator iterator = a.iterator();
		while(iterator.hasNext()){
		System.out.println(iterator.next());
}
}
}