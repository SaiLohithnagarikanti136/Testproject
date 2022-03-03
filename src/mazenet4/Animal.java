package mazenet4;
import mazenet4.*;

public class Animal {
	
	public void legs() {
		System.out.println("Legs Method");
	}
	public void tail() {
		System.out.println("Tails Method");
	}

	public static void main(String[] args) {
		Animal a=new Animal() ;
		mamma m=new mamma();
		a.legs();
		m.legs();
		m.tail();
	}

}



