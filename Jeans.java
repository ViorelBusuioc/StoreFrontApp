public class Jeans extends ProductForSale {

    public Jeans(String type, double price, String description) {
        super(type, price, description);

    }

    @Override
    public void showDetails() {
        System.out.println("Shirts type: " + getType() + "\n" +
                            "Price: " + getPrice() + "\n" +
                            "Description: " + getDescription());
    }

}
