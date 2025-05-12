package Phan3;

import java.util.Scanner;

public class MinArr {
    public static void main(String[] args) {
        int[] arr = { 2,3,77,6,55,46,78};
        int min = minValue(arr);
        System.out.println("Gia tri nho nhat la: " + min);
    }
    public static int minValue(int []arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}
