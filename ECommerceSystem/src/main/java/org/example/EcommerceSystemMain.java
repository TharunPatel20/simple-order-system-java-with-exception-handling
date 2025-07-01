package org.example;

import org.example.entity.Order;
import org.example.entity.Product;
import org.example.entity.User;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class EcommerceSystemMain {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            Product[] products = new Product[]{
                    new Product(1, "Apple", 900),
                    new Product(2, "Pen", 100),
                    new Product(3, "Guava", 300),
                    new Product(4, "Book", 600),
                    new Product(5, "Banana", 500),
            };

            System.out.print("Enter your name:\t");
            String name = scanner.next();
            scanner.nextLine();

            System.out.print("Enter the number of orders you want to place:\t");
            int ordersCount = scanner.nextInt();
            int userId = 101;

            User user = new User(userId++, name, ordersCount);

            for (Product p : products) p.displayProductDetails();

            System.out.println("\nEnter product_id/s to create order (you can add up to 10 products):");
            Product[] orderProducts = new Product[10];
            int count = 0;

            while (true) {
                System.out.print("Enter Product ID to add OR 0 to stop: ");
                int pId = scanner.nextInt();
                if (pId == 0) break;
                if (pId >= 1 && pId <= products.length) {
                    orderProducts[count++] = products[pId - 1];
                } else {
                    System.out.println("Invalid product ID. Try again.");
                }
            }

            user.placeOrder(Arrays.copyOf(orderProducts, count));
            user.viewOrders();

        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter valid numbers.");
        } catch (IllegalArgumentException | IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Unexpected error: " + e.getMessage());
        }
    }
}
