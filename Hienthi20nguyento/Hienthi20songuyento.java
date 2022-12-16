package Hienthi20nguyento;

import java.util.Scanner;

public class Hienthi20songuyento {
    public static void main(String[] args) {
        System.out.println("nhap so");
        Scanner prompt = new Scanner(System.in);
        int number = prompt.nextInt();
        // hàm for để in ra các số TRUE nếu hàm true hoặc false bên dưới đuưa ra kết quả true;
        for (int i = 2; i < 100; i++) {
            //In số nguyên tố bé thua 100 (i <100)
            //In sô nguyên tố bình thường thay điều kiện lặp (i < number)
            if (check(i)) {
                System.out.println(i);
            }
        }
    }
    //hàm kiểm tra true hoăc false của số nguyên tố
    public static boolean check(int x) {
        if (x < 2) {
            return false;
        }else {
            for (int i = 2; i < x; i++) {
                if (x % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }
}