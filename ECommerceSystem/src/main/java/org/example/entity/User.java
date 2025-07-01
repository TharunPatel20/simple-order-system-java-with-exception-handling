package org.example.entity;

public class User {
    private int userId;
    private String name;
    private Order[] orders;
    private int orderCount = 1;
    private int maxOrders;

    public User() {}

    public User(int userId, String name, int maxOrders) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("User name cannot be null or empty.");
        }
        if (maxOrders <= 0) {
            throw new IllegalArgumentException("User must be able to place at least one order.");
        }

        this.userId = userId;
        this.name = name;
        this.maxOrders = maxOrders;
        this.orders = new Order[maxOrders + 1];
    }

    public int getUserId() { return userId; }
    public String getName() { return name; }
    public int getMaxOrders() { return maxOrders; }
    public int getOrderCount() { return orderCount; }
    public Order[] getOrders() { return orders; }

    public void setUserId(int userId) { this.userId = userId; }
    public void setName(String name) { this.name = name; }
    public void setMaxOrders(int maxOrders) { this.maxOrders = maxOrders; }
    public void setOrderCount(int orderCount) { this.orderCount = orderCount; }
    public void setOrders(Order[] orders) { this.orders = orders; }

    public void placeOrder(Product[] products) {
        if (products == null || products.length == 0) {
            throw new IllegalArgumentException("Cannot place an order with no products.");
        }
        if (orderCount > maxOrders) {
            throw new IllegalStateException("Order limit reached.");
        }

        this.orders[orderCount] = new Order(orderCount, products);
        System.out.println("\nOrder placed successfully!");
        System.out.println("Orders for " + this.getName() + ":");
        orders[orderCount].displayOrderDetails();
        orderCount++;
    }

    public void viewOrders() {
        for (Order o : orders) {
            if (o != null) {
                o.displayOrderDetails();
                System.out.println();
            }
        }
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", name='" + name + '\'' +
                ", orders=" + java.util.Arrays.toString(orders) +
                ", orderCount=" + orderCount +
                '}';
    }
}
