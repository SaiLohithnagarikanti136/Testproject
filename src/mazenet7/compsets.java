package mazenet7;
import java.util.*;

public class compsets {
	public static void main(String args[]){
	Set<String> a = new HashSet<>();
	a.add("ns");
	a.add("katy");
	a.add("Sandy");
	a.add("laharish");
	Set<String> b = new HashSet<>();
	b.add("lohith");
	b.add("abhi");
	b.add("ram");
	b.add("ns");
	b.add("Sandy");
	b.add("laharish");
	Set<String> c = new HashSet<>();
	for(String i:a)
	{
	for(String j:b){
	if(i==j) {
	c.add(i);
	}
	}
	}
	System.out.println("Common elements are as follows: ");
	for(String k:c){
		System.out.println(k);
	}

	System.out.println("******");
	}
}
