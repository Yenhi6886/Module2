package Phan3;

import java.util.Scanner;

public class TimGiaTri {
    public static void main(String[] args) {
        String[] students = {"Helly","Cany","Linda","Sienna","Michael"};
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten sinh vien muon tim: ");
        String input = sc.nextLine();
        boolean isExist = false;
        for(int i = 0; i < students.length; i++) {
            if(students[i].equals(input)) {
                System.out.println("Sinh vien "+input+" ở vị trí thứ "+(i +1));
                isExist = true;
                break;
            }
        }
        if(!isExist) {
            System.out.println("Không tìm thấy "+input+" trong danh sách");
        }
    }
}
