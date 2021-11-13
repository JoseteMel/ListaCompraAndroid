package com.sanvalero.listadelacompraejercicio3.domain;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Product {

    @PrimaryKey(autoGenerate = true)
    private int id;
    @ColumnInfo
    private String name;
    @ColumnInfo
    private String category;
    @ColumnInfo
    private int quantity;
    @ColumnInfo
    private float price;
    @ColumnInfo
    private boolean isImportant;

    public Product(String name, String category, int quantity, float price, boolean isImportant) {
        this.name = name;
        this.category = category;
        this.quantity = quantity;
        this.price = price;
        this.isImportant = isImportant;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
