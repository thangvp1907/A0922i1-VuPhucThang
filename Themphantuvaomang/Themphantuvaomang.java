package Themphantuvaomang;

import java.util.Arrays;
import java.util.Scanner;

public class Themphantuvaomang {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 6, 7, 8, 9};
        System.out.println("Nhajap vaof số muốn thêm : ");

        //so muốn thêm
        Scanner prompt = new Scanner(System.in);
        int number = prompt.nextInt();

        //vi tri muốn thêm
        System.out.println("vi tri muon them trong mang");
        Scanner prompt2 = new Scanner(System.in);
        int index = prompt2.nextInt();

        //hàm để thực hiện
            if (index <= 1 || index > array.length - 1) {
                System.out.println("khoogn tìm thấy vị trí trong mảng");
            }
            for (int j = array.length-1; j > index; j--) {
                    array[j] = array[j-1];
                }
            array[index]=number;
        System.out.println(Arrays.toString(array));
    }
}
//for (int i =array.length;i >= 0 ; i--)