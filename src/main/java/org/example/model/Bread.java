package org.example.model;

public class Bread extends ProductForSale {
    private String flourType;

    public Bread(double price, String description, String flourType) {
        super("Bread", price, description);
        this.flourType = flourType;
    }

    public String getFlourType() {
        return flourType;
    }

    @Override
    public void showDetails() {
        System.out.println("Product Type: " + getType());
        System.out.println("Price: $" + getPrice());
        System.out.println("Description: " + getDescription());
        System.out.println("Flour Type: " + flourType);
    }
}