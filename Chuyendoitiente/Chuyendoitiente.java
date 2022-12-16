package Chuyendoitiente;

import java.util.Scanner;

public class Chuyendoitiente {
    public static void main(String[] args) {
        System.out.println("nhap tien viet");
        Scanner prompt=new Scanner(System.in);
        double tienusd= prompt.nextInt();
        double tienviet = tienusd * 23000;
        System.out.println("Tien usd: "+tienusd+" "+"Tien viet: "+tienviet);
    }
}
