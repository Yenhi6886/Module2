package Phan3;

import java.util.Scanner;

public class SoLanXuatHien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập vào chuỗi: ");
        String inputString = sc.nextLine();

        System.out.println("Nhập vào kí tự cần đếm: ");
        char inputCharacter = sc.next().charAt(0);

        int count = 0;
        for (int i = 0; i < inputString.length(); i++) {
            if(inputString.charAt(i) == inputCharacter) {
                count++;
            }
        }
        System.out.println("Kí tự "+inputCharacter +" xuật hiện "+ count+" lần");
    }
}
