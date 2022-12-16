package Xoaphantutrongmang;

import java.util.Scanner;

public class Xoaphantutrongmang {
    public static void main(String[] args) {
        int[] number={1,2,3,4,5,6,7,8};
        System.out.println(" Số muốn xóa");
        Scanner prompt =new Scanner(System.in);
        int hienthi= prompt.nextInt();
        for (int i = 0; i < number.length ; i++) {
            if ( hienthi  == number[i]) {
                for (int j = i; j < number.length - 1; j++) {
                    number[j] = number[j + 1];
                }
            }
        }
        for (int i = 0; i <number.length ; i++) {
            System.out.print(number[i]+ " ");
        }
    }
}
