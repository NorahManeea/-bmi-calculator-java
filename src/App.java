import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your weight in kilograms: ");
        double weight = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Enter your height in centimeters: ");
        double height = scanner.nextDouble();
        height /= 100;
        scanner.nextLine();

        double bmi = weight / (height * height);

        if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            System.out.println("Normal Weight");
        } else if (bmi >= 25 && bmi <= 29.9) {
            System.out.println("Overweight");
        } else if (bmi >= 30) {
            System.out.println("Obese");
        } else {
            System.out.println("Invalid input");
        }

        scanner.close();
    }
}