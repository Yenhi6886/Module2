package Phan3;

import java.util.Scanner;

public class ThemPhanTu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số phần tử của mảng: ");
        int N = sc.nextInt();
        int[] arr = new int[N + 1];
        for (int i = 0; i < N; i++) {
            System.out.println("Phan tu thu " + i + " la:");
            arr[i] = sc.nextInt();
        }

        System.out.println("Nhap gia tri can chen: ");
        int X = sc.nextInt();

        System.out.println("Nhap vi tri can chen: ");
        int index = sc.nextInt();

        if (index >N|| index <0) {
            System.out.println("Vi tri chen khong hop le");
        } else {
            for (int i = N; i > index; i--) {
                arr[i] = arr[i - 1];
            }
            arr[index] = X;

            System.out.println("Mang sau khi chen: ");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]+" ");
            }
        }
    }
}

