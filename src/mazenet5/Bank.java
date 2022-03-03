package mazenet5;

public interface Bank {		
		public void ROI();
		public static void main(String[] srgs) {
			SBI sbi=new SBI();
			sbi.ROI();
			
		}
	}
	class SBI implements Bank{

		@Override
		public void ROI() {
			System.out.println("Rate Of Interest is : 2%");
			
	}		
}
