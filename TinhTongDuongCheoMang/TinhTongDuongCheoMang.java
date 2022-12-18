package TinhTongDuongCheoMang;

import java.util.Scanner;

public class TinhTongDuongCheoMang {
    public static void main(String[] args) {
        Scanner prompt = new Scanner(System.in);
        int cotDong,cotDoc;
        System.out.println("Nhập cột dòng");
        cotDong= prompt.nextInt();
        System.out.println("nhập cột dọc");
        cotDoc= prompt.nextInt();
        int array[][]= new int[cotDong][cotDoc];
        for (int i = 0; i <cotDong ; i++) {
            for (int j = 0; j <cotDoc ; j++) {
                System.out.print("nhập phần tử: ["+i+","+j+"]");
                array[i][j]= prompt.nextInt();
            }
        }
        System.out.println("mảng vừa nhập: ");
        for (int i = 0; i < cotDong; i++) {
            for (int j = 0; j < cotDoc; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println("\n");
        }
        // hàm thực hiện tổng đưường chéo
        int sum =0;
        for (int i = 0; i <cotDong ; i++) {
            for (int j = 0; j <cotDoc ; j++) {
                if(i==j){
                    sum += array[i][j];
                }
            }
        }
        System.out.println("tổng đường chéo trong mảng là: " + sum);
    }
}
