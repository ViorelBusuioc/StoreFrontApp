import java.util.ArrayList;

record OrderItem(int qty, ProductForSale product) {
}

public class Store {

    private static ArrayList<ProductForSale> storeProducts = new ArrayList<>();

    public static void main(String[] args) {

        storeProducts.add(new Shirts("Casual",5.99,"White Cotton Shirt"));
        storeProducts.add(new Jeans("Formal",15.49,"Denim Levis Jeans"));

        listProducts();

        System.out.println("\nOrder1");
        var order1 = new ArrayList<OrderItem>();
        addItemToOrder(order1,1,2);
        addItemToOrder(order1,0,1);
        printOrder(order1);

    }

    public static void listProducts() {
        for (var item : storeProducts) {
            System.out.println("-".repeat(30));
            item.showDetails();
        }
    }

    public static void addItemToOrder(ArrayList<OrderItem> order, int orderIndex, int qty) {
        order.add(new OrderItem(qty, storeProducts.get(orderIndex)));
    }

    public static void printOrder(ArrayList<OrderItem> order) {
        double salesTotal = 0;
        for (var item : order) {
            item.product().pricedLineItem(item.qty());
            salesTotal += item.product().salesPrice(item.qty());
        }
        System.out.printf("Sales Total = $%6.2f %n",salesTotal);
    }
}


