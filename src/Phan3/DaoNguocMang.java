package Phan3;

import java.util.Scanner;

public class DaoNguocMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        int[] arr;
        do {
            System.out.print("Do dai cua mang: ");
            size = sc.nextInt();
            if(size >20) {
                System.out.println("Do dai phai nho hon 20");
            }
        } while (size >20);
        arr = new int[size];
        int i = 0;
        while (i < arr.length) {
            System.out.println("Phan tu thu "+(i+1)+": ");
            arr[i] = sc.nextInt();
            i++;
        }
        System.out.printf("%-20s%s","Mang da nhap la: ","");
        for(int j = 0; j < arr.length; j++) {
            System.out.print(arr[j]+"\t");
        }

        for(int j = 0; j < arr.length/2; j++) {
            int temp = arr[j];
            arr[j] = arr[size-j-1];
            arr[size-j-1] = temp;
        }
        System.out.printf("\n%-20s%s","Mang sau khi dao la: ","");
        for(int j = 0; j < arr.length; j++) {
            System.out.print(arr[j]+"\t");
        }
    }
}
