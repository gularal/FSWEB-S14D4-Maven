package org.example.model;

public class Coke extends ProductForSale {
    private boolean salty;

    public Coke(double price, String description, boolean salty) {
        super("Coke", price, description);
        this.salty = salty;
    }

    public boolean salty() {
        return salty;
    }

    @Override
    public void showDetails() {
        System.out.println("Product Type: " + getType());
        System.out.println("Price: $" + getPrice());
        System.out.println("Description: " + getDescription());
        System.out.println("Salty: " + (salty ? "Yes" : "No"));
    }
}