public class Discount {
    public static void main(String[] args) {
        double price = 250.0;
        double discountRate = 15.0;

        double discount = (discountRate / 100) * price;
        double finalPrice = price - discount;

        System.out.printf("Final price after 15%% discount: $%.2f%n", finalPrice);
    }
}