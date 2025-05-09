package Phan1;

import java.util.Scanner;

public class SoThanhChu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so: ");
        int number = sc.nextInt();

        if (number < 0 || number > 9999) {
            System.out.println("Nhap sai so");
        } else if (number < 10) {
            System.out.println(docDonVi(number));
        } else if (number < 20) {
            System.out.println(docHaiChuc(number));
        } else if (number < 100) {
            int donVi = number % 10; // lay phan don vi
            int chuc = number / 10; // lay phan chuc
            String result = docChuc(chuc);
            if (donVi != 0) {
                result += " " + docDonVi(donVi);
            }
            System.out.println(result);
        } else {
            int hundreds = number / 100; // lay phan tram
            int phanDu = number % 100; // lay phan du

            String result = docDonVi(hundreds) + " hundred";
            if(phanDu != 0) {
                result += " and ";
                if (phanDu < 10) {
                    result += docDonVi(phanDu);
                } else if(phanDu < 20) {
                    result += docHaiChuc(phanDu);
                } else {
                    int donVi = phanDu % 10; // lay phan don vi
                    int chuc = phanDu / 10; // lay phan chuc
                    result += docChuc(chuc);
                    if (donVi != 0) {
                        result += " " + docDonVi(donVi);
                    }
                }
            }
            System.out.println(result);
        }
    }

    public static String docDonVi(int num) {
        String result = "";
        switch (num) {
            case 0:
                result = "zero";
                break;
            case 1:
                result = "one";
                break;
            case 2:
                result = "two";
                break;
            case 3:
                result = "three";
                break;
            case 4:
                result = "four";
                break;
            case 5:
                result = "five";
                break;
            case 6:
                result = "six";
                break;
            case 7:
                result = "seven";
                break;
            case 8:
                result = "eight";
                break;
            case 9:
                result = "nine";
                break;
            default:
                result = "Invalid";
                break;
        }
        return result;
    }

    public static String docHaiChuc(int num) {
        String result = "";
        switch (num) {
            case 10:
                result = "ten";
                break;
            case 11:
                result = "eleven";
                break;
            case 12:
                result = "twelve";
                break;
            case 13:
                result = "thirteen";
                break;
            case 14:
                result = "fourteen";
                break;
            case 15:
                result = "fifteen";
                break;
            case 16:
                result = "sixteen";
                break;
            case 17:
                result = "seventeen";
                break;
            case 18:
                result = "eighteen";
                break;
            case 19:
                result = "nineteen";
                break;
            default:
                result = "Invalid";
                break;
        }
        return result;
    }

    public static String docChuc(int num) {
        String result = "";
        switch (num) {
            case 2:
                result = "twenty";
                break;
            case 3:
                result = "thirty";
                break;
            case 4:
                result = "forty";
                break;
            case 5:
                result = "fifty";
                break;
            case 6:
                result = "sixty";
                break;
            case 7:
                result = "seventy";
                break;
            case 8:
                result = "eighty";
                break;
            case 9:
                result = "ninety";
                break;
            default:
                result = "Invalid";
                break;
        }
        return result;
    }
}

