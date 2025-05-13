package Phan3;

import java.util.Scanner;

public class TongDuongCheoChinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập số dòng");
        int rows = sc.nextInt();
        System.out.println("Nhập số cột");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];
        if (rows == cols) {
            System.out.println("Nhap phan tu vao trong mang");
            for(int i=0; i<rows; i++) {
                for(int j=0; j<cols; j++) {
                    System.out.println("Phần tử thứ [ "+i+" ][ "+j+" ]");
                    matrix [i][j]= sc.nextInt();
                }
            }
        }else {
            System.out.println("Nhập lại số cột bằng số hàng");
        }

        int duongCheoChinh = 0;
        for(int i=0; i<rows; i++) {
            for(int j=i; j<cols; j++) {
                duongCheoChinh += matrix[i][j];
            }
        }
        System.out.println("Tổng đường chéo chính: " + duongCheoChinh);

        /*int duongCheoPhu = 0;
        for(int i=0; i<rows; i++) {
            for(int j=rows-1;j >=0; j--) {
                duongCheoPhu += matrix[i][j];
            }
        }
        System.out.println("Tổng đường chéo phụ: " + duongCheoPhu);*/

    }
}
