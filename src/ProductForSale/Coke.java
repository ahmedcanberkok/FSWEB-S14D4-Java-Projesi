package ProductForSale;

public class Coke extends  ProductForSale {
    private boolean isCold ;
    public Coke(String type, double price, String description, boolean isCold) {
        super(type, price, description);
        this.isCold = isCold ;
    }

    public boolean isCold() {
        return isCold;
    }

    @Override
    public void showDetails() {
        System.out.println("----------------------");
        System.out.println(" Product type : " + getType());
        System.out.println(" Price : " + getPrice() + "₺");
        System.out.println(" Description : " + getDescription());
        System.out.println(" isCold : " + isCold() );
    }
}
