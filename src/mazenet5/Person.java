package mazenet5;

public class Person {
	int id;
	String name;
	Person(){
		
	}
	
	Person(int id,String name){
		this.id=id;
		this.name=name;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	
	public static void main(String[] args) {
		Person p=new Person(1,"lohith");
		
		Emp emp=new Emp(p.getId(),p.getName(),50000.f);
		emp.display();

	}

}


class Emp extends Person{
	
	float salary;

	Emp(int id, String name,float salary) {
		super(id, name);
		this.salary=salary;
		
	}

	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public void display() {
		System.out.println("id : "+this.getId()+"\tname : "+this.getName()+"\tsalary : "+this.getSalary());
	}

	
}

