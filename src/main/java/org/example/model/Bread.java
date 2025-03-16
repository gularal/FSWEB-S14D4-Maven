package org.example.model;

public class Bread extends ProductForSale {
    private String Bran;

    public Bread(double price, String description, String Bran) {
        super("Bread", price, description);
        this.Bran = Bran;
    }

    public String getBran() {
        return Bran;
    }

    @Override
    public void showDetails() {
        System.out.println("Product Type: " + getType());
        System.out.println("Price: $" + getPrice());
        System.out.println("Description: " + getDescription());
        System.out.println("Bran: " + Bran);
    }
}