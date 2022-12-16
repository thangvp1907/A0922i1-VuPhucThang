package Baitaptinhsongay.BaitapTinhsongay;

import java.util.Scanner;

public class js {
    public static void main(String[] args) {
        System.out.println("Tinh so ngay trong thang");
        System.out.println("so nam");
        Scanner prompt1 = new Scanner(System.in);
        int month = prompt1.nextInt();
        Scanner prompt2 = new Scanner(System.in);
        int year = prompt2.nextInt();
        switch (month) {
            case 2:
                System.out.println("Thang 2 co 29 ngay");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println(month + " " + "31 ngay");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println(month + "30 ngay");
            default:
                System.out.println("Nhap lai3");
        }
        if (year % 4 == 0 && year % 100 != 0) {
            System.out.println("nam nhuan");
        } else {
            System.out.println("nam ko nhuan");
        }
    }
}
