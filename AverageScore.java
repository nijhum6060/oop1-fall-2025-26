import java.util.Scanner;

public class AverageScore {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter score of first student: ");
        double s1 = input.nextDouble();

        System.out.print("Enter score of second student: ");
        double s2 = input.nextDouble();

        System.out.print("Enter score of third student: ");
        double s3 = input.nextDouble();

        double average = (s1 + s2 + s3) / 3;
        System.out.printf("Average score: %.2f%n", average);

        input.close();
    }
}
