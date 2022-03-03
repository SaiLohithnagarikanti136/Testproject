package mazenet4;

public class Student {
	int id;
	String name;
	String degree;
	int ex,c;
	
	public void setValues(int ids,String n) {
		id=ids;
		name=n;
	}
	public void getValues() {
		System.out.println("id no is :"+id+"\tname is : "+name);
		
	}


	public static void main(String[] args) {
		Student s=new Student();
		s.setValues(1, "nsl");
		s.getValues();
		Student s1=new Student();
		s1.setValues(2, "lohith");
		s1.getValues();
		Student s2=new Student();
		s2.setValues(3, "nsai");
		s2.getValues();


	}

}
