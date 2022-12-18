package TimSoLonNhatNhoNhat;

import java.util.Scanner;

public class Timphantulonnhat {
    public static void main(String[] args) {
        //khai báo và nhập mảng 2 chiều
        int soDong,soCot;
        Scanner prompt =new Scanner(System.in);
        System.out.println("nhập số dòng");
        soDong= prompt.nextInt();
        System.out.println("nhập số cột");
        soCot= prompt.nextInt();

        int array[][]= new int[soDong][soCot];

        for (int i = 0; i <soDong ; i++) {
            for (int j = 0; j <soCot ; j++) {
                System.out.print("nhập phần tử:["+i+","+j+"]");
                array[i][j]= prompt.nextInt();
            }
        }

        //hàm thuwjc hiện tìm số lớn nhất
        int max=array[0][0];
        for (int i = 0; i < soDong ; i++) {
            for (int j = 0; j < soCot ; j++) {
                if(array[i][j] > max){
                    max=array[i][j];
                }
            }
        }
        //hàm thực hiện tìm số thứ hai
        int max2=array[0][0];
        for (int i = 0; i < soDong ; i++) {
            for (int j = 0; j < soCot ; j++) {
                if(array[i][j] >max2 && array[i][j] < max){
                    max2=array[i][j];
                }
            }
        }

        // hàm tìm số nhỏ nhất
        int min = array[0][0];
        for (int i = 0; i < soDong ; i++) {
            for (int j = 0; j < soCot ; j++) {
                if(array[i][j] < min ){
                    min=array[i][j];
                }
            }
        }

        System.out.println("số lớn nhất: "+ max);
        System.out.println("số lớn thứ 2: "+ max2);
        System.out.println("số bé nhất: "+ min);
    }
}
