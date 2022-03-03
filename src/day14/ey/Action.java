package day14.ey;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Action {
     public static void main(String[] args) {
    	 ArrayList<Basket> list = new ArrayList<Basket>(Arrays.asList(new Basket((long)1,5),
                 (new Basket((long) 5,10)), (new Basket((long) 2,6)), new Basket((long) 4,8)));

         System.out.println("product with highest quantity: " + list.get(Basket.getBasketWithHighestQuantity(list)).getManufactureNo());
         System.out.println("product with lowest quantity: " + list.get(Basket.getBasketWithLowestQuantity(list)).getManufactureNo());
         System.out.println("total: " + Basket.totalQtyOfAllBaskets());
         

    }
}
