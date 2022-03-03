package mazenet5;

public class Bankcl {
	

	public static void main(String[] args) {
		SBIb sbi=new SBIb();
		sbi.getRateOfInterest();
		
		ICICI ici=new ICICI();
		ici.getRateOfInterest();
		
		Axis ax=new Axis();
		ax.getRateOfInterest();
	}

}

class SBIb extends Bankcl{
	
	public void getRateOfInterest() {
		System.out.println("RateOfInterest of SBI is :2%");
	}
	
}



class ICICI extends Bankcl{
	
	public void getRateOfInterest() {
		System.out.println("RateOfInterest of ICICI is :2.5%");
	}
	
}



class Axis extends Bankcl{
	
	public void getRateOfInterest() {
		System.out.println("RateOfInterest of Axis is :1.5%");
	}
	
}

