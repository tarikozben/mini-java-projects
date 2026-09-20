package TelephonePriceGame;

public class Smartphone {
    private String brand;
    private String model;
    private double price;

    public Smartphone(String brand, String model,double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public void applyDiscount(double discountPercentage) {
        this.price = this.price - (this.price * discountPercentage/100);
    }
    public void compareTelephones(Smartphone otherSmartphone) {
        if(otherSmartphone.price > this.price) {
            System.out.println(this.brand + " is lower than " + otherSmartphone.brand);
        } else {
            System.out.println(this.brand + " is higher than " + otherSmartphone.brand);
        }
    }

    public void tellMeThePrice() {
        System.out.println(brand + " " + model + ": " + price);
    }
}
