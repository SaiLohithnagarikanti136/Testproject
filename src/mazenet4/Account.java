package mazenet4;

public class Account {
	private long accNo;
	private String name;
	private String email;
	private float amt;
	
	public long getAccNo() {
		return accNo;
	}

	public void setAccNo(long accNo) {
		this.accNo = accNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public float getAmt() {
		return amt;
	}

	public void setAmt(float amt) {
		this.amt = amt;
	}
	
	public void details() {
		System.out.println("AccNo :"+getAccNo()+"\nName :"+getName()+"\nemail :"+getEmail()+"\nAmount :"+getAmt());
	}

	public static void main(String[] args) {

		Account ns=new Account();
		ns.setAccNo(98481684);
		ns.setName("Lohith");
		ns.setEmail("nsl@gmail.com");
		ns.setAmt(100000);
		ns.details();
		
	}

}