import java.util.Scanner;

public class SwapIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first integer (a): ");
        int a = scanner.nextInt();
        System.out.print("Enter second integer (b): ");
        int b = scanner.nextInt();

        System.out.println("Before swapping:");
        System.out.println("a = " + a + ", b = " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After swapping:");
        System.out.println("a = " + a + ", b = " + b);

        scanner.close();
    }
}
