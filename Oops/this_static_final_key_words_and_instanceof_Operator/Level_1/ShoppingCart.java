class Product {
    
    static double discount = 10.0; 
    
    private final int productID;

    private String productName;
    private double price;
    private int quantity;

    public Product(int productID, String productName, double price, int quantity) {
        this.productID = productID;  
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    public static void updateDiscount(double newDiscount) {
        discount = newDiscount;
        System.out.println("Discount updated to " + discount + "% for all products.");
    }

    public double getFinalPrice() {
        double total = price * quantity;
        return total - (total * discount / 100);
    }

    public void displayDetails() {
        if (this instanceof Product) { 
            System.out.println("Product ID: " + productID);
            System.out.println("Name: " + productName);
            System.out.println("Price: " + price);
            System.out.println("Quantity: " + quantity);
            System.out.println("Discount: " + discount + "%");
            System.out.println("Final Price: " + getFinalPrice());
            System.out.println("---------------------------");
        } else {
            System.out.println("Not a valid Product object!");
        }
    }
}

public class ShoppingCart {
    public static void main(String[] args) {
       
        Product p1 = new Product(101, "Laptop", 50000, 1);
        Product p2 = new Product(102, "Headphones", 2000, 2);

        p1.displayDetails();
        p2.displayDetails();

        Product.updateDiscount(15.0);

        p1.displayDetails();
        p2.displayDetails();
    }
}
