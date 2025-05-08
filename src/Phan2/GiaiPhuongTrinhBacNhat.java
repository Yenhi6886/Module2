package Phan2;

import java.util.Scanner;

public class GiaiPhuongTrinhBacNhat {
    public static void main(String[] args) {
        System.out.println("Giai phuong trinh bac nhat");
        Scanner sc = new Scanner(System.in);
        System.out.print("a: ");
        double a = sc.nextDouble();

        System.out.print("b: ");
        double b = sc.nextDouble();

        System.out.print("c: ");
        double c = sc.nextDouble();

        if (a != 0) {
            double answer = (c - b) / a;
            System.out.printf("x = %f\n", answer);
        } else {
            //a = 0
            if (b == c) {
                System.out.printf("Vo so nghiem");
            } else {
                System.out.printf("Vo nghiem");
            }
        }
    }
}
