package Phan3;

import java.util.Scanner;

public class ChuyenDoiNhietDo {
    public static void main(String[] args) {
        System.out.println("---Menu---");
        System.out.println("1.Fahrenheit to Celsius");
        System.out.println("2.Celsius to Fahrenheit");
        System.out.println("3.Exit");
        double fahrenheit;
        double celsius;
        int choice;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Fahrenheit: ");
                    fahrenheit = sc.nextDouble();
                    System.out.println("Fahrenheit to Celsius: " + fahrenheitToCelsius(fahrenheit));
                    break;
                case 2:
                    System.out.println("Celsius: ");
                    celsius = sc.nextDouble();
                    System.out.println("Celsius to Fahrenheit: " + celsiusToFahrenheit(celsius));
                    break;
                case 0:
                    System.out.println("Exit");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        } while (choice != 0);

    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        return celsius;
    }

    public static double celsiusToFahrenheit(double celsius) {
        double fahrenheit = (9.0 / 5) * (celsius + 32);
        return fahrenheit;
    }
}
