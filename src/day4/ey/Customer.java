package day4.ey;

public class Customer {
	private String name;
	private String address;
	private int age;
	private double balance;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void displayCustomerDetails(){
		System.out.println("Name: " + getName() + "Address: " + getAddress() + "Age: " + getAge() +
				"Balance: " + getBalance());
	}


}
