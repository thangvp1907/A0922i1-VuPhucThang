package Chuoitangdan;

import java.util.ArrayList;
import java.util.Scanner;

public class chuoiTangDan {
    public static void main(String[] args) {
        //tạo một array rỗng
        ArrayList<Character> arr1= new ArrayList<>();

        //tạo người dùng nhập chuỗi
        System.out.println("Nhập chỗi: ");
        Scanner prompt = new Scanner(System.in);
        String str = prompt.nextLine();

        //Thuật toán
        for (int i = 0; i <str.length() ; i++) {
            //tạo một array trung gian
            ArrayList<Character> arr2 = new ArrayList<>();
            //thêm ký tự thứ i vào danh sách
            arr2.add(str.charAt(i));
            for (int j = 0; j <str.length() ; j++) {
                if(str.charAt(j) > arr2.get(i)){
                    arr2.add(str.charAt(j));
                }
            }
            if(arr2.size() > arr1.size()){
                arr1.clear();
                arr1.addAll(arr2);
            }
            arr2.clear();
        }
    }
}
