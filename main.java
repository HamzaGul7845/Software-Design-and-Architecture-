import java.util.ArrayList;
import java.util.List;

class LineItem {
    private String productName;
    private int quantity;
    private double price;

    // Constructor
    public LineItem(String productName, int quantity, double price) {
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }

    // Method to calculate total price of this line item
    public double getTotalPrice() {
        return quantity * price;
    }
}

class Order {
    private List<LineItem> lineItems;

    // Constructor
    public Order() {
        lineItems = new ArrayList<>();
    }

    // Creator principle: Order creates LineItem objects
    public void addLineItem(String productName, int quantity, double price) {
        LineItem lineItem = new LineItem(productName, quantity, price);
        lineItems.add(lineItem);
    }

    // Method to calculate total price of the entire order
    public double getTotalOrderPrice() {
        double total = 0;
        for (LineItem item : lineItems) {
            total += item.getTotalPrice();
        }
        return total;
    }
}

public class main {
    public static void main(String[] args) {
        Order order = new Order();
        order.addLineItem("Laptop", 1, 1200.00);
        order.addLineItem("Mouse", 2, 25.00);

        System.out.println("Total Order Price: " + order.getTotalOrderPrice());
    }
}
