package Hienthicacloaihinh;

import java.util.Scanner;

public class Hienthicacloaihinh {
    public static void main(String[] args) {
        int choice = -1;
        Scanner input = new Scanner(System.in);
        while (choice != 4) {
            System.out.println("Chọn Hình");
            System.out.println("1.Hình chữ nhât");
            System.out.println("2.Tam giác vuông");
            System.out.println("3.Tam giác vuông topleft");
            System.out.println("4. Thoát");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("nhap chieu dai");
                    Scanner prompt1= new Scanner(System.in);
                    int chieudai =prompt1.nextInt();
                    System.out.println("nhap chieu rong");
                    Scanner prompt2= new Scanner(System.in);
                    int chieurong= prompt2.nextInt();
                    for (int i = 0; i < chieudai ; i++) {
                        for (int j = 0; j < chieurong ; j++) {
                            System.out.print("*");
                        }
                        System.out.println(" ");
                    }
                    break;
                case 2: //Hình tam giác vuông
                    System.out.println("nhap chieu cao");
                    Scanner prompt3= new Scanner(System.in);
                    int tamgiac =prompt3.nextInt();
                    for (int i = 0; i <tamgiac ; i++) {
                        for (int j = 0; j <= i ; j++) {
                            System.out.print("*");
                        }
                        System.out.println(" ");
                    }
                    break;
                case 3: //hình tam giác vuông tróc ngược
                    System.out.println("nhap chieu cao");
                    Scanner prompt4= new Scanner(System.in);
                    int tamgiacnguoc =prompt4.nextInt();
                    for (int i = 0; i < tamgiacnguoc ; i++) {
                        for (int j = 0; j < tamgiacnguoc ; j++) {
                            if(j >= i){
                                System.out.print("*");
                            }
                        }
                        System.out.println(" ");
                    }
                    break;

            }
        }
    }
}