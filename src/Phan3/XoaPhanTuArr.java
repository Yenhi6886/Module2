package Phan3;

import java.util.Scanner;

public class XoaPhanTuArr {
    public static void main(String[] args) {
        int[] arr = {2, 3, 77, 6, 55, 46, 78};
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap phan tu muon xoa: ");
        int X = sc.nextInt();

        boolean isExist = false;
        int index_del = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == X) {
                System.out.println("Ton tai " + X + " trong mang de xoa o vi tri " + (i + 1));
                index_del = i;
                isExist = true;
                break;
            }
        }
        if (!isExist) {
            System.out.println(" Khong ton tai " + X + " trong mang de xoa");
        } else {
            for (int i = index_del; i < arr.length-1; i++) {
                arr[i] = arr[i + 1];
            }
            System.out.println("Mang sau khi xoa "+X+": ");
            for (int i = 0; i < arr.length-1; i++) {
                System.out.print(arr[i]+" ");
            }
        }

    }
}
