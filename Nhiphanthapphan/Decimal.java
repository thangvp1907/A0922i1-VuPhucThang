package Nhiphanthapphan;

import java.util.Scanner;
import java.util.Stack;

public class Decimal {
    public static void main(String[] args) {
        //tạo 1 stack rooxng
        Stack<Integer> Stack = new Stack<>();
        //Cho người dùng nhập vào
        Scanner prompt = new Scanner(System.in);
        System.out.println("Nhập số vào: ");
        int Number = prompt.nextInt();

        while (Number !=0){
            //chuyển đổi sang nhị phân
            int numberThapPhan = Number%2;
            //đưa vào stack
            Stack.push(numberThapPhan);
            //chia tiếp số đó cho đến Number==0
            Number /= 2;
        }

        //In ra
        //Sau khi chuyển thành nhị phân in ra màn hình
        System.out.println("Số nhị phân là");
        while (!(Stack.isEmpty())){
            System.out.print(Stack.pop());
        }
    }
}

