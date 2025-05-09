package Phan1;

import java.util.Scanner;

public class NamNhuan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        System.out.println("Nhap nam: ");
        boolean isLeapYear = false;

        boolean chiaHet4 = year % 4 == 0;
        if(chiaHet4) {
            boolean chiaHet100 = year % 100 == 0;
            if(chiaHet100) {
                boolean chiaHet400 = year % 400 == 0;
                if(chiaHet400) {
                    isLeapYear = true;
                }
            } else {
                isLeapYear = true;
            }
        }
        if(isLeapYear) {
            System.out.printf("%d la nam nhuan", year);
        } else {
            System.out.printf("%d khong phai la nam nhuan", year);
        }
    }
}
