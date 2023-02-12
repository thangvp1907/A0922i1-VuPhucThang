package Exception;

import java.lang.reflect.Array;
import java.util.Random;
import java.util.Scanner;

public class Arrayindexoutofboundsexception {
    public Integer[] Exception(){
        //Ngẫu nhiên chọn số
        Random rd =new Random();
        Integer[] arr = new Integer [100];
        //Dùng for để in phần tử
        for (int i = 0; i < arr.length ; i++) {
            arr[i] = rd.nextInt(100);
            System.out.print(arr[i]+" ");
        }
        return arr;
    }
    public static void main(String[] args) {
        Arrayindexoutofboundsexception arrExample = new Arrayindexoutofboundsexception();
        Integer[] arr =arrExample.Exception();

        Scanner prompt = new Scanner(System.in);
        System.out.println("Nhập vị trí bất kỳ để tìm số: ");
        int number = prompt.nextInt();
        try{
            System.out.println(arr[number]+" tại vị trí "+number);
        }catch (IndexOutOfBoundsException e){
            System.out.println("Số nằm ngoài 100");
        }
    }
}
