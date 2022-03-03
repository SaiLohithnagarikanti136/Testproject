package day14.ey;
import java.util.*;
import java.util.stream.*;

public class Basket {
	
	 public Basket(long manufactureNo, int qty) {
	        this.manufactureNo = manufactureNo;
	        this.qty = qty;
	        allqnt += qty;
	    }

	    private long manufactureNo;
	    private int qty;
	    static int allqnt = 0;
	    @Override
	    public String toString() {
	        return "Basket{" +
	                "manufactureNo=" + manufactureNo +
	                ", qty=" + qty +
	                '}';
	    }

	    public long getManufactureNo() {
	        return manufactureNo;
	    }

	    public void setManufactureNo(long manufactureNo) {
	        this.manufactureNo = manufactureNo;
	    }

	    public int getQty() {
	        return qty;
	    }

	    public void setQty(int qty) {
	        this.qty = qty;
	    }
	    public static int getBasketWithHighestQuantity(ArrayList<Basket> list){
	        int position =0;
	        int i = 0;
	        int q= list.get(0).qty;
	        for(Basket var: list){
	            if(var.qty > q ){
	                q = var.qty;
	                position = i;
	            }
	            i+=1;
	        }
	    return position;
	    }
	    public static int getBasketWithLowestQuantity(ArrayList<Basket> list){
	        int position =0;
	        int i = 0;
	        int q= list.get(0).qty;
	        for(Basket var: list){
	            if(var.qty < q ){
	                q = var.qty;
	                position = i;
	            }
	            i+=1;
	        }
	        return position;
	    }

	    public static int totalQtyOfAllBaskets(){
	        return allqnt;
	    }

	}