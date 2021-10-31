package com.sanvalero.listadelacompraejercicio3.domain;

public class Product {

    private String name;
    private String category;
    private int quantity;
    private float price;
    private boolean isImportant;

    public Product(String name, String category, int quantity, float price, boolean isImportant) {
        this.name = name;
        this.category = category;
        this.quantity = quantity;
        this.price = price;
        this.isImportant = isImportant;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public boolean isImportant() {
        return isImportant;
    }

    public void setImportant(boolean important) {
        isImportant = important;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return name + " (" + quantity + ") = " + price + "€";
    }
}
