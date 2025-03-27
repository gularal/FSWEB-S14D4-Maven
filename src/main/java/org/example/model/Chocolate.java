package org.example.model;

public class Chocolate extends ProductForSale {
    private int cocoaPercentage;

    public Chocolate(double price, String description, int cocoaPercentage) {
        super("Chocolate", price, description);
        this.cocoaPercentage = cocoaPercentage;
    }

    public int getCocoaPercentage() {
        return cocoaPercentage;
    }

    @Override
    public void showDetails() {
        System.out.println("Product Type: " + getType());
        System.out.println("Price: $" + getPrice());
        System.out.println("Description: " + getDescription());
        System.out.println("Cocoa Percentage: " + cocoaPercentage + "%");
    }
}