// Base class
class Order {
    int orderId;
    String orderDate;

    public Order(int orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    public void getOrderStatus() {
        System.out.println("Order Status: Order Placed");
    }
}

// Subclass 1
class ShippedOrder extends Order {
    String trackingNumber;

    public ShippedOrder(int orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    @Override
    public void getOrderStatus() {
        System.out.println("Order Status: Shipped (Tracking No: " + trackingNumber + ")");
    }
}

class DeliveredOrder extends ShippedOrder {
    String deliveryDate;

    public DeliveredOrder(int orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    @Override
    public void getOrderStatus() {
        System.out.println("Order Status: Delivered on " + deliveryDate);
    }
}

public class OrderDemo {
    public static void main(String[] args) {
        Order order = new Order(101, "2025-09-10");
        order.getOrderStatus();

        ShippedOrder shipped = new ShippedOrder(102, "2025-09-08", "TRK12345");
        shipped.getOrderStatus();

        DeliveredOrder delivered = new DeliveredOrder(103, "2025-09-05", "TRK67890", "2025-09-09");
        delivered.getOrderStatus();
    }
}
