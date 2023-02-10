package Insertionsort;

import java.util.Scanner;

public class Insertionsort {

    public static void inserTionSort(int[] arrlist) {
        //tạo vòng lặp để xét
        for (int i = 1; i < arrlist.length ; i++) {
            //Đánh dấu phần tử đầu tiên để xét
            int temp = arrlist[i];
            //Đánh dấu phần tử thứ hai để xét với phần tử đầu tiên
            int j = i - 1;
            //tạo vòng lặp while điều kiện phần tử j > phần tử trước nó
            while (j >= 0 && arrlist[j] > temp) {
                //Đẩy các phần tử lớn hơn qua trái
                arrlist[j + 1] = arrlist[j];
                //Điều kiện để xét vòng lặp từ phải sang trái
                j--;
            }
            //Nếu ko thỏa mản điều kiện while,đưa phần tử lên bằng vị trí temp
            arrlist[j + 1] = temp;
        }
        //hiển thị
        for (int i = 0; i < arrlist.length ; i++) {
            System.out.print(arrlist[i] +" ");
        }
    }

    public static void main(String[] args) {
        Scanner prompt = new Scanner(System.in);
        //Nhập độ dài mảng
        System.out.println("Nhập độ dài: ");
        int number = prompt.nextInt();
        int arrlist [] = new int[number];
        //Nhập phần tử vào mảng
        for (int i = 0; i < number; i++) {
            System.out.print("Nhập phần tử: " + i + " ");
            arrlist[i]= prompt.nextInt();
        }
        //Gọi hàm sắp xếp chèn để thực thi
        inserTionSort(arrlist);
    }
}
