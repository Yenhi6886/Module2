package Phan2;

import java.util.Scanner;

public class SoNguyenTo {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so vao day de kiem tra: ");
        int number = sc.nextInt();

        if(number <2) {
            System.out.println("Khong phai la so nguyen to");
        } else {
            boolean check = true;
            int i = 2;
            while(i < number) {
                if(number % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
            if(check) {
                System.out.println(number+" la so nguyen to");
            } else {
                System.out.println(number+" khong phai la so nguyen to");
            }
        }
        sc.close();
    }
}
