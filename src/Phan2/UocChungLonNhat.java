package Phan2;

import java.util.Scanner;

public class UocChungLonNhat {

    /*    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Nhap a: ");
        int b = sc.nextInt();
        System.out.println("Nhap b: ");
        a = Math.abs(a);
        b = Math.abs(b);
        if (a == 0 || b == 0) {
            System.out.println("Khong co uoc chung lớn nhất");
        }
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        System.out.println("Uoc chung lớn nhất là: "+a);
    }*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap a: ");
        int a = sc.nextInt();
        System.out.print("Nhap b: ");
        int b = sc.nextInt();

        if (a == 0 || b == 0) {
            System.out.println("Không có ước chung lớn nhất");
        }
        int uocChung = tinhUocChung(a, b);
        System.out.println("Ước chung lớn nhất là: "+uocChung);
        sc.close();
    }

    public static int tinhUocChung(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);

        if (b == 0) return a;
        return tinhUocChung(b, a % b);
    }
}
