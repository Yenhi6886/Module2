package Phan2;

import java.util.Scanner;

public class HienSoNguyenTo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("So luong so nguyen to");
        int numbers = sc.nextInt();

        int count = 0;
        int N=2;

        while (count<numbers) {
            if (KiemTraSoNguyenTo(N)) {
                count++;
                System.out.print(count+ " ");
            }
            N++;
        }
        sc.close();
    }
    public static boolean KiemTraSoNguyenTo(int num) {
        if (num <2) {
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
