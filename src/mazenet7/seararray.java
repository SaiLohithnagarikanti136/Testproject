package mazenet7;
import java.util.*;
public class seararray {
		public static void main(String args[]){
		ArrayList<String> a = new ArrayList<>();
		a.add("Lohith");
		a.add("abdul");
		a.add("mathwik");
		a.add("varun");
		a.add("laharish");
		Scanner sc = new Scanner(System.in);
		String f = sc.nextLine();
		int index = a.indexOf(f);
		if(index == -1){
		System.out.println("Element doesn't found");
        }
		else{
		System.out.println("Element found at index : "+index);
}
}
}