# Simple E-Commerce Order System in Java (Using Arrays)

## 🧾 Overview

This is a basic simulation of an **e-commerce order placement system** using **Java** with **Object-Oriented Programming (OOP)** principles. It models the interactions between `User`, `Product`, and `Order` using **arrays**, making it a beginner-friendly example to understand class relationships and data handling in Java.

---

## 🎯 Objectives

- Demonstrate core **OOP concepts**: encapsulation, object interaction, and class design.
- Implement a **fixed-size order management system** using arrays.
- Simulate **order placement and summary generation** without database or UI.
- Help beginners practice handling **arrays of objects** and basic class relationships.
- Introduce robust exception handling for order limits, null inputs, and unexpected errors.
- Prepare for user input gathering through validated console-based interaction.

---

## 📌 Expectations

By completing this project, a learner is expected to:

- Understand how to define and use multiple Java classes working together.
- Gain hands-on experience working with arrays of objects.
- Learn to structure business logic into separate responsibilities (Product, Order, User).
- Understand basic validation and exception handling strategies in object-oriented design.
- Implement exception safety in business logic such as order placement and data display.
- Be able to gather and validate user input using Scanner and proper error handling.
- Be able to display structured and meaningful output from object methods.

---

## 📦 Classes and Responsibilities

### 1. `Product` Class

**Purpose**: Represents a single product in the e-commerce system.

**Fields**:

- `int productId`: Unique ID of the product.
- `String name`: Name of the product.
- `double price`: Price of the product.

**Methods**:

- `Product(int productId, String name, double price)`: Constructor to initialize product.
- `void displayProductDetails()`: Prints product details.

---

### 2. `Order` Class

**Purpose**: Represents a customer's order, which may include multiple products.

**Fields**:

- `int orderId`
- `Product[] products`
- `double totalAmount`

**Methods**:

- `Order(int orderId, Product[] products)`
- `double calculateTotal()`
- `void displayOrderDetails()`

---

### 3. `User` Class

**Purpose**: Represents a customer who can place multiple orders.

**Fields**:

- `int userId`
- `String name`
- `Order[] orders`
- `int orderCount`

**Methods**:

- `User(int userId, String name, int maxOrders)`
- `void placeOrder(Product[] products)`
- `void viewOrders()`

---

### 4. `ECommerceSystem` Class (Main)

**Purpose**: Main class to simulate system behavior:

- Create sample products
- Create a user
- Let the user place an order
- Display the order summary

---

## 🚀 Enhancements

### 1. Null Product Array Handling in Order Constructor

Add a check to prevent null or empty product arrays, which could cause runtime exceptions:

### 2. Order Limit Handling in User Class

Replace simple message with a formal exception to make it more robust. Throw `IllegalStateException` when order limit is reached.

### 3. Display Method Null Safety

Avoid `NullPointerException` during order or product display:


### 4. Global Exception Handling in Main Method

Use a try-catch block around the main logic to catch unexpected runtime errors:


### 5. Input Validation

Collect user input later (via `Scanner`), handle potential input errors:


## ✅ Expected Output

```
Order placed successfully!
Orders for Tharun:
Order ID: 1
    Product ID: 1, Name: Apple, Price: 900.0
    Product ID: 2, Name: Pen, Price: 100.0
    Total Amount: 1000.0
```
