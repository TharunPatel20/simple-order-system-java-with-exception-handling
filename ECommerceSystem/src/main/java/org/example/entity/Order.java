package org.example.entity;

import java.util.Arrays;

public class Order {
    private int orderId;
    private Product[] products;
    private double totalAmount;

    public Order(int orderId, Product[] products) {
        this.orderId = orderId;
        this.products = products;
    }

    public double calculateTotal() {
        if (products == null || products.length == 0) return 0;
        this.totalAmount = Arrays.stream(products)
                .mapToDouble(Product::getPrice)
                .sum();
        return this.totalAmount;
    }

    public void displayOrderDetails() {
        System.out.println("Order ID: " + this.orderId);
        if (products == null || products.length == 0) {
            System.out.println("\tNo products available");
        } else {
            for (Product p : products) {
                p.displayProductDetails();
            }
        }
        System.out.println("\tTotal Amount: " + calculateTotal());
    }

    public int getOrderId() { return orderId; }
    public Product[] getProducts() { return products; }
    public double getTotalAmount() { return totalAmount; }

    public void setOrderId(int orderId) { this.orderId = orderId; }
    public void setProducts(Product[] products) { this.products = products; }
    public void setTotalAmount(double totalAmount) { this.totalAmount = totalAmount; }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", products=" + Arrays.toString(products) +
                ", totalAmount=" + totalAmount +
                '}';
    }
}
