package Tinhtongsoomotcot;

import java.util.Arrays;
import java.util.Scanner;

public class TinhTongSoMotCot {
    public static void main(String[] args) {
        Scanner prompt = new Scanner(System.in);
        int soDong, soCot;
        System.out.println("nhập hàng dòng");
        soDong = prompt.nextInt();
        System.out.println("nhập hàng cột");
        soCot = prompt.nextInt();
        int array[][] = new int[soDong][soCot];
        for (int i = 0; i < soDong; i++) {
            for (int j = 0; j < soCot; j++) {
                System.out.print("Nhập phần tử: [" + i + "," + j + "]");
                array[i][j] = prompt.nextInt();
            }
        }
        System.out.println("Mảng vừa nhập: ");
        for (int i = 0; i < soDong; i++) {
            for (int j = 0; j < soCot; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println("\n");
        }

        //Hàm thực hiện tổng
        int sum = 0;
        System.out.println("Nhập tính tổng cột: ");
        int Cot = prompt.nextInt();
        for (int i = 0; i < soDong; i++) {
            for (int j = 0; j < soCot; j++) {
                if (j == Cot) {
                    sum += array[i][Cot];
                }
            }
        }
        System.out.println("tổng của cột: " + Cot + " là " + sum);
    }
}
