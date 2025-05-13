package Phan3;

import java.util.Scanner;

public class TongCacSoMotCot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập số hàng: ");
        int rows = sc.nextInt();
        System.out.println("Nhập số cột: ");
        int cols = sc.nextInt();

        double[][] arr = new double[rows][cols];

        System.out.println("Nhập các phần tử cho mảng");
        for(int i = 0; i<rows; i++) {
            for(int j = 0; j<cols; j++) {
                System.out.println("Phần tử thứ [ "+i+"]["+j+"]: ");
                arr[i][j] = sc.nextDouble();
            }
        }

        System.out.println("Nhập chỉ số cột cần tính tổng: ");
        int colIndex = sc.nextInt();

        if (colIndex >cols || colIndex <0) {
            System.out.println("Chỉ số không tồn tại");
        } else {
            double total = 0;
            for(int i =0; i<rows; i++) {
                total += arr[i][colIndex];
            }
            System.out.println("Tổng phần tử trong cột là: "+total);
        }
    }
}
