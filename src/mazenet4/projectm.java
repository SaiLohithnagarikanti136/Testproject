package mazenet4;
import java.util.*;
public class projectm {
		int experience=0;
		int c=0;
		String degree;
		Scanner sc = new Scanner(System.in);
		public void shortlist() {
			while(c<3){ 
				experience=sc.nextInt();
				degree=sc.next();
				if(experience >=5 && degree.equals("MBA")){
					c++;
				}
			}
			if(c==3){

				System.out.println("Process is completed");

				}
}
		public static void main(String[] args) { 
			projectm r=new projectm(); 
			r.shortlist();
		}
}