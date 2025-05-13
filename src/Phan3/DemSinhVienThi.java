package Phan3;

import java.util.Scanner;

public class DemSinhVienThi {
    public static void main(String[] args) {
        int size;
        int[] ar;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Nhap so luong sinh vien");
            size = sc.nextInt();
            if (size > 30) {
                System.out.println("Khong duoc qua 30 sinh vien");
            }
        } while (size > 30);

        ar = new int[size];
        int i = 0;
        while (i < ar.length) {
            System.out.print("Sinh vien thu nhat co so diem la: ");
            ar[i] = sc.nextInt();
            i++;
        }

        int count = 0;
        System.out.println("Danh sach diem sinh vien: ");
        for (int j = 0; j < ar.length; j++) {
            System.out.print(ar[j]+"\t");
            if (ar[j]>=5 && ar[j]<=10) {
                count++;
            }
        }
        System.out.print("\n So sinh vien thi do la: "+count);
    }
}
