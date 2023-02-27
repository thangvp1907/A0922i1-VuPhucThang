package Nhap;

import java.util.Scanner;

public class CalculationExample {
    public static void calc() {
        System.out.print("Hãy nhập x: ");
        Scanner prompt =new Scanner(System.in);
        int x = prompt.nextInt();
        System.out.print("Hãy nhập y: ");
        int y = prompt.nextInt();
        int tong = 0;
        int hieu = 0;
        int tich = 0;
        int thuong = 0;
        try {
            tong = x + y;
            hieu = x - y;
            tich = x * y;
            thuong = x / y;
            System.out.println(tong);
            System.out.println(hieu);
            System.out.println(tich);
            System.out.println(thuong);
            if (x <= 0 || y <= 0) {
                throw new RuntimeException("Có số âm");
            }
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args) {
        calc();
    }
}
