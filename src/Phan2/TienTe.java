package Phan2;

import java.util.Scanner;

public class TienTe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap gia tien USD: ");
        double money = sc.nextDouble();
        double VND = money * 23000;
        System.out.printf("Số tiền VND: %.2f VND\n", VND);
        sc.close();
    }
}
