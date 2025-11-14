import java.util.Scanner;

public class MortgageCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter loan amount (principal): ");
        double principal = input.nextDouble();

        System.out.print("Enter annual interest rate (in %): ");
        double annualRate = input.nextDouble();

        System.out.print("Enter loan term (in years): ");
        int years = input.nextInt();

        double monthlyRate = annualRate / 100 / 12;
        int numberOfPayments = years * 12;

        double monthlyPayment = principal *
                (monthlyRate * Math.pow(1 + monthlyRate, numberOfPayments)) /
                (Math.pow(1 + monthlyRate, numberOfPayments) - 1);

        System.out.printf("Monthly Payment: %.2f%n", monthlyPayment);

        input.close();
    }
}
