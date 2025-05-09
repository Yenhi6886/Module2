package Phan1;

import java.util.Scanner;

public class ToanTu {
    public static void main(String[] args) {
        float width;
        float height;

        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap chieu rong: ");
        width = sc.nextFloat();

        System.out.println("Nhap chieu dai: ");
        height = sc.nextFloat();

        float area = width * height;
        System.out.printf("Dien tich: " + area);
    }
}
