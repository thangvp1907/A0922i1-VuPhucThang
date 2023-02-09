package Demerging;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Demerging {
    //tạo 2 queue dạng array rỗng
    Queue<String> nam = new ArrayDeque<>();
    Queue<String> nu = new ArrayDeque<>();

    public static void main(String[] args) {
        //Tạo thông tin cho người nhập
        Scanner prompt = new Scanner(System.in);
        System.out.println("-------Nhập thông tin----");
        System.out.print("Ho va Ten: ");
        String fullName = prompt.nextLine();
        System.out.println("Ngay sinh: ");
        String dayOfBirth= prompt.nextLine();
        System.out.println("Gioi tinh: ");
        String gender = prompt.nextLine();
    }
}
