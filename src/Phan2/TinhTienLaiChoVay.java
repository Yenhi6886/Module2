package Phan2;

import java.util.Scanner;

public class TinhTienLaiChoVay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số tiền gửi (VND): ");
        double money = sc.nextDouble();

        System.out.print("Nhập số tháng gửi: ");
        int month = sc.nextInt();

        System.out.print("Nhập lãi suất (%): ");
        double lai = sc.nextDouble();

        double tinhTienLaiChoVay = money * (lai / 100) * (month / 12.0);

        System.out.printf("Tiền lãi: %.2f VND\n", tinhTienLaiChoVay);
        sc.close();
    }
}
