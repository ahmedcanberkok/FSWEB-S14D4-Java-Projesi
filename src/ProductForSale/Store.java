package ProductForSale;


public class Store {
    public static void main(String[] args) {

        listProducts();
        ProductForSale[] products = new ProductForSale[5] ;
        products[0] = new Chocolate("dark chocolate",21.10, "Kahvenin yaninda iyi",70.5);
        products[1] = new Bread("Glutensiz Zeytinli Baget" , 25.4 , "kahvaltıda güzel olur.",120);
        products[2] = new Coke("Zero", 35.5,"Soguk içiniz.", false);

    }

    public static void listProducts(ProductForSale[] products) {
        if (products != null) {
            for (ProductForSale product : products) {
                if (product == null) {
                    product.showDetails();
                }
            }
        }

    }
}
