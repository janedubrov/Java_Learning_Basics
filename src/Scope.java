public class Scope {
    public static void main(String[] args) {
        double priceCar = 10_000;
        System.out.println("Old car price: "+ priceCar);

        if (priceCar > 9_000){
            double discount = priceCar * 0.05;
            System.out.println("Discount: " + discount);

            double newPrice = priceCar - discount;
            System.out.println("New price is " + newPrice);
        }
    }
}
