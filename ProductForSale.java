public abstract class ProductForSale {

    private String type;
    private double price;
    private String description;

    public ProductForSale(String type, double price, String description) {
        this.type = type;
        this.price = price;
        this.description = description;
    }

    public double salesPrice(int qty) {
        return price * qty;
    }

    public void pricedLineItem(int qty) {
        salesPrice(qty);
        System.out.printf("%d x %s ............... %.2f | $%.2f%n",qty,description,price, salesPrice(qty));
    }

    public abstract void showDetails();

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }
}
