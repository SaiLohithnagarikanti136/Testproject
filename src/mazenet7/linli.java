package mazenet7;
import java.util.*;

public class linli {
	public static void main(String args[]){
	List<String> a = new LinkedList<>();
	a.add("katy");
	a.add("karun");
	a.add("abdul");
	a.add("lohith");
	Scanner sc= new Scanner(System.in);
	int p = sc.nextInt();
	String b = sc.nextLine();
	a.add(p-1,b);
	for(String i:a) {
	System.out.println(i);
	}
}
}
