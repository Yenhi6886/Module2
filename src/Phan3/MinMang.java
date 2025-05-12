package Phan3;

import java.util.Scanner;

public class MinMang {
    public static void main(String[] args) {
        int[] arr;
        int size;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong phan tu");
        size = sc.nextInt();
        arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Gia tri thu nhat: ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Mang sau khi nhap la");
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i] + " ");
        }
        int min = arr[0];
        for (int i = 1; i < size; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Gia tri nho nhat trong mang la: "+min);
    }
}
