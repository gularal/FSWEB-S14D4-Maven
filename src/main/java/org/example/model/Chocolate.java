package org.example.model;

public class Chocolate extends ProductForSale {
    private int cocoa;

    public Chocolate(double price, String description, int cocoa) {
        super("Chocolate", price, description);
        this.cocoa = cocoa;
    }

    public int getCocoaPercentage() {
        return cocoa;
    }

    @Override
    public void showDetails() {
        System.out.println("Product Type: " + getType());
        System.out.println("Price: $" + getPrice());
        System.out.println("Description: " + getDescription());
        System.out.println("Cocoa: " + cocoa + "%");
    }
}