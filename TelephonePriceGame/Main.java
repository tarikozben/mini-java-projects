package TelephonePriceGame;

public class Main {
    public static void main(String[] args) {

        Smartphone apple = new Smartphone("Apple", "iPhone 16", 45000);
        Smartphone samsung = new Smartphone("Samsung", "A50", 38000);
        Smartphone xiaomi = new Smartphone("Xiaomi", "14", 30000);

        Smartphone[] smartphones = {apple, samsung, xiaomi};

        apple.applyDiscount(10);
        samsung.applyDiscount(20);

        for (Smartphone smartphone : smartphones) {
            smartphone.tellMeThePrice();
        }
        apple.compareTelephones(samsung);


    }
}
