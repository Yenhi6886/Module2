package Phan3;

import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        int[] arr1 ;
        int[] arr2 ;
        arr1 = new int[5];
        arr2 = new int[4];
        int[] arr3 = new int[arr1.length+arr2.length];
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap mang thu nhat");
        for (int i = 0; i < arr1.length; i++) {
            System.out.println("Gia tri thu " + i +": ");
            arr1[i] = sc.nextInt();
        }
        System.out.println("Nhap mang thu hai");
        for (int i = 0; i < arr2.length; i++) {
            System.out.println("Gia tri thu " + i +": ");
            arr2[i] = sc.nextInt();
        }

        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            arr3[arr1.length+i] = arr2[i];
        }

        System.out.println("Mang sau khi gop:");
        for(int value : arr3) {
            System.out.print(value+" ");
        }
    }
}
