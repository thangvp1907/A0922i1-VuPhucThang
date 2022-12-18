package DemSoKyTu;

import java.util.Scanner;

public class DemSoKyTu {
    public static void main(String[] args) {
        //Nhập chuỗi
        System.out.println("nhập chuỗi");
        Scanner prompt =new Scanner(System.in);
        String str = prompt.nextLine();

        //Chữ Muốn Đếm
        System.out.println("Chữ muốn đếm");
        String lettercount= prompt.nextLine();


        //hàm check số ký tự
        int count =0;
        for (int i = 0; i <str.length() ; i++) {
            if(str.charAt(i)== lettercount.charAt(0)){
                count++;
            }
        }
        System.out.println("số ký tự trùng: " + count);

    }
}
