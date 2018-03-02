/*
 * Aliza Huynh
 * BillOfSale.java
 * This program calculates the bill of sale
 * Given the price, payment, and taxes on the item.
 */

package billofsale;

/**
 *
 * @author alhuy9821
 */
public class BillOfSale {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double price = 12.49;
        double paid = 20.0;
        
        //calculate tax using the price of the item
        double tax = 12.49*0.13;
        
        //total cost using the final price as well as the amount paid
        double total = tax*paid;
        double change = 2000%1249;

        //Displays all of the costs
        System.out.println("The purchase price is " + price + " dollars.");
        System.out.println("The cost including the tax is " + tax + " dollars.");
        System.out.println("The amount given to the clerk is " + paid + " dollars.");
        System.out.println("The amount of change needed is " + change + " dollars.");
        
    }
    
}
