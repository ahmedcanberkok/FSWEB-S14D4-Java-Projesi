package ProductForSale;

public class Bread extends ProductForSale{

    private int Calorie ;

    public Bread(String type, double price, String description, int Calorie) {
        super(type, price, description);
        this.Calorie = Calorie ;
    }

    public int getCalorie() {
        return Calorie;
    }

    @Override
    public void showDetails() {
        System.out.println("----------------------");
        System.out.println(" Product type : " + getType());
        System.out.println(" Price : " + getPrice() + "₺");
        System.out.println(" Description : " + getDescription());
        System.out.println(" Calorie : " + getCalorie() + "Calorie");

    }
}
