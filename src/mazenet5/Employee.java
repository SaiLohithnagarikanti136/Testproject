package mazenet5;

public class Employee {
	private float salary;
	public static void main(String[] args) {
		Employee emp=new Employee();
		Programmer pro=new Programmer();
		emp.setSalary(45000.45f);
		pro.setBonus(5000);
		pro.totalSalary(emp.getSalary());

	}
	public float getSalary() {
		return salary;
	}


	public void setSalary(float salary) {
		this.salary = salary;
	}

}

class Programmer extends Employee{
	int bonus;
	float total_salary;
	
	public int getBonus() {
		return bonus;
	}
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	public float getTotal_salary() {
		return total_salary;
	}
	public void setTotal_salary(float total_salary) {
		this.total_salary = total_salary;
	}
	
	public void totalSalary(float salary) {
		this.total_salary=this.bonus+salary;
		System.out.println("Total Salary is :" + this.total_salary);
		
	}

}
