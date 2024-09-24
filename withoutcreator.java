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

    // Method to add an already-created LineItem to the order
    public void addLineItem(LineItem lineItem) {
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

public class withoutcreator {
    public static void main(String[] args) {
        Order order = new Order();

        // The main method is responsible for creating LineItem objects
        LineItem laptop = new LineItem("Laptop", 1, 1200.00);
        LineItem mouse = new LineItem("Mouse", 2, 25.00);

        // Adding line items to the order
        order.addLineItem(laptop);
        order.addLineItem(mouse);

        System.out.println("Total Order Price: " + order.getTotalOrderPrice());
    }
}

