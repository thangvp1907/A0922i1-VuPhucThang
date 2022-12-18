package Gopmang;

import java.util.Arrays;
import java.util.Scanner;

public class Gopmang {
    public static void main(String[] args) {
        int array1[] = new int [5];
        int array2[] = new int [5];
        int arraySum[] = new int [10];
        int element =0;
        System.out.println("nhập cho mảng 1");
        Scanner prompt = new Scanner(System.in);
        for (int i = 0; i < array1.length ; i++) {
            array1[i] = prompt.nextInt();
        }
        System.out.println("nhập cho mảng 2");
        Scanner prompt2 =new Scanner(System.in);
        for (int i = 0; i < array2.length ; i++) {
            array2[i] = prompt2.nextInt();
        }
        for (int i : array1) {
            arraySum[element]=i;
            element++;
        }
        for (int i : array2) {
            arraySum[element]=i;
            element++;
        }
        System.out.print(Arrays.toString(arraySum) +" ");
    }
}
