package IllegalTriangleException;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class test2 {
    public int[] crearRandom() {
        //Tạo 1 mảng số nguyên random
        Random random = new Random();
        Scanner prompt = new Scanner(System.in);
        int size = prompt.nextInt();
        int[] arr = new int[size];
        //tạo mảng chứa số ngẫu nhiên
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10);
            System.out.println(arr[i]);
        }
        return arr;
    }

    

    //tạo phưởn thức người dùng nhập
    public static void main(String[] args) {
        test2 test = new test2();
        int[] arrlist = test.crearRandom();
        Scanner prompt = new Scanner(System.in);
        System.out.println("số cần tìm: ");
        int kt = 0;
        int x = 0;
        try {
            x = prompt.nextInt();
            boolean check = false;
            do {
                check = false;
                try {
                    System.out.println("Nhập số");
                    x = prompt.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("Phải nhập số");
                    check = true;
                    prompt.nextInt();
                }
            }while (check);

            if (x < 0) {
                throw new NegativeArraySizeException("Nhập số âm,nhập lại ");
            } else if (x >= 100) {
                throw new NegativeArraySizeException("Số lớn hơn 100");
            }
            for (int i = 0; i < arrlist.length; i++) {
                if (x == arrlist[i]) {
                    System.out.println("Số " + arrlist[i] + " vị trí ở: " + i);
                    kt++;
                }
            }
            if (kt == 0) {
                System.out.println("not found!");
            }
        } catch (NegativeArraySizeException e) {
            System.out.println(e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Ko phải l số");
        }
    }
}

