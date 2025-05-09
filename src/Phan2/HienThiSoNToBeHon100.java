package Phan2;

import java.util.Scanner;

public class HienThiSoNToBeHon100 {
    public static void main(String[] args) {
        System.out.println("Hiển thị các số nguyên tố bé hơn 100");
        int N = 2;
        while (N<100) {
            if (KiemTraSoNguyenTo(N)) {
                System.out.print(N + " ");
            }
            N++;
        }
    }

    public static boolean KiemTraSoNguyenTo(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
