

package Nhap;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        int size = 0;
        int count = 0;
        Scanner prompt = new Scanner(System.in);
        //Hàm tạo số lượng danh sách
        do {
            System.out.println("Nhập số lượng học viên");
            size = prompt.nextInt();
            prompt.nextLine();
            if (size > 30) System.out.println("Nhập quá số lượng");
        } while (size > 30);

        //hàm điền tên sinh vieen vào mảng
        String[] arrayNameStudent = new String[size];// hàm cho độ dài mảng bằng size
        for (int i = 0; i < size; i++) {
            System.out.println("Nhập tên của sinh viên" + (i + 1) + ": ");
            arrayNameStudent[i] = prompt.nextLine();
        }

        //hàm nhập điểm
        int [] arrayDiem = new int[size];
        for (int i = 0; i <arrayNameStudent.length ; i++) {
            System.out.println("Điểm số của"+arrayNameStudent[i]+ ": ");
            arrayDiem[i]= prompt.nextInt();
            if(arrayDiem[i]>=5 && arrayDiem[i] <=10){
                System.out.println("thí sinh: "+arrayNameStudent[i]+" "+"Số điểm đã đạt: "+arrayDiem[i]+"  Đậu");
                count++;
            }else {
                System.out.println("thí sinh: "+arrayNameStudent[i]+" "+"Số điểm đã đạt: "+arrayDiem[i]+"  Rớt");
            }
        }
    }
}
