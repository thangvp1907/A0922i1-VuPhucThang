package Timkiemnhiphan;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class TimKiemNhiPhan {

    private static final int NOT_Found = -1;

    public static int binarySearchR(int[] numlist, int x, int begin, int end) {
        int mid = (begin + end) / 2;
        if (begin > end) return NOT_Found;
        if (numlist[mid] == x) return mid;
        if (numlist[mid] > x) return binarySearchR(numlist, x, begin, mid - 1);
        return binarySearchR(numlist, x, mid + 1, end);
    }

    public static void main(String[] args) {
        Scanner prompt = new Scanner(System.in);
        //Nhập độ dài mảng
        System.out.println("Nhập độ dài mảng: ");
        int sizearr = prompt.nextInt();
        int[] numlist = new int[sizearr];
        //Dùng for đưa vào mảng
        for (int i = 0; i < sizearr; i++) {
            System.out.print("Nhập phần tử: " + i + ": ");
            numlist[i] = prompt.nextInt();
        }
        //Sắp xếp theo tăng dần
        Arrays.sort(numlist);
        //in ra marng
        for (int i = 0; i < numlist.length; i++) {
            System.out.print(numlist[i]+ "\n" );
        }
        //tìm phần tử x
        System.out.println("Nhập số cần tìm: ");
        int x = prompt.nextInt();
        //gọi hàm để thực hiện
        int search = binarySearchR(numlist, x, 0, numlist.length - 1);
        System.out.println("index: "+ search +" Số cần tìm là: "+ x);
    }
}
