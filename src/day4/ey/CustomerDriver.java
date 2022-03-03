package day4.ey;

public class CustomerDriver {

	public static void main(String[] args) {
		Customer cust1 = new Customer(); 
		cust1.setName ("Rajesh");

		cust1.setAddress("1 MG Road");

		cust1.setAge(35);

		cust1.setBalance (6890.56); 
		
		Customer cust2 = new Customer();

		cust2.setName("Sunita");

		cust2.setAddress("3 MG Road");

		cust2.setAge(27);

		cust2.setBalance (34560.00);

		cust1.displayCustomerDetails();

		cust2.displayCustomerDetails();

	}

}
