package org.example.entity;

public class Product {
    private int productId;
    private String name;
    private double price;

    public Product() {}

    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    public int getProductId() { return productId; }
    public String getName() { return name; }
    public double getPrice() { return price; }

    public void setProductId(int productId) { this.productId = productId; }
    public void setName(String name) { this.name = name; }
    public void setPrice(double price) { this.price = price; }

    public void displayProductDetails() {
        System.out.println("    Product ID: " + productId +
                ", Name: " + name +
                ", Price: " + price);
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
