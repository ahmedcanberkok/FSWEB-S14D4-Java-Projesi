package ProductForSale;

import java.util.SortedMap;

public class Chocolate extends  ProductForSale{
    private double cocoaPercentage;

    public Chocolate(String type, double price, String description,double cocoaPercentage) {

        super(type, price, description);
        this.cocoaPercentage = cocoaPercentage ;
    }

    public double getCocoaPercentage() {
        return cocoaPercentage;
    }

    @Override
    public void showDetails() {
        System.out.println("----------------------");
        System.out.println(" Product type : " + getType());
        System.out.println(" Price : " + getPrice() + "₺");
        System.out.println(" Description : " + getDescription());
        System.out.println(" Cocoa Percentage : " + getCocoaPercentage() + "%");

    }
}
