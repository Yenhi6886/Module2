package Phan3;

import java.util.Scanner;

public class MaxArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        int[] arr;
        do {
            System.out.println("So luong gia tri muon nhap: ");
            size = sc.nextInt();
            if (size > 20 || size < 1) {
                System.out.println("Vui long nhap so luong nho hon 20");
            }
        } while (size > 20);
        arr = new int[size];
        int i = 0;
        while (i < arr.length) {
            System.out.println("Gia tri thu " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
            i++;
        }
        System.out.println("Mang da nhap la: ");
        for (int j = 0; j < arr.length; j++) {
            System.out.println(arr[j] + "\t");
        }
        int max = arr[0];
        int count = 0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] > max) {
                max = arr[j];
                count = j + 1;
            }
        }
        System.out.println("Gia tri lon nhat la: " + max + " o vi tri thu " + count);
    }

}
