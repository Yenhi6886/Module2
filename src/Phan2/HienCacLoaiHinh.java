package Phan2;

import java.util.Scanner;

public class HienCacLoaiHinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. In hinh chu nhat");
        System.out.println("2. In hinh tam giac vuong bottom left");
        System.out.println("3. In hinh tam giac vuong top left");
        System.out.println("4. In hinh tam giac can");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("1. In hinh chu nhat");
                for (int i = 1; i <= 3; i++) {
                    for (int j = 1; j <= 7; i++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            case 2:
                for (int i = 5; i >= 1; i--) {
                    for (int j = 1; j <= i; j++) {
                        System.out.println("*");
                    }
                    System.out.println();
                }
                break;
            case 3:
                for (int i = 1; i <= 5; i++) {
                    for (int j = 5; j >= i; j--) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            case 4:
                for (int i = 1; i <=7 ; i++) {
                    for (int j = 7;j>0 ;j--) {
                        System.out.print(" ");
                    }
                    for (int k=1;k<=(2*i-1);k++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
        }
    }
}
