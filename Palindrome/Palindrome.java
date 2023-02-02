package Palindrome;

import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        //tạo người dùng nhập vào
        System.out.println("Điền chuỗi vào: ");
        Scanner prompt = new Scanner(System.in);
        String value = prompt.nextLine();


        //tạo queue cho hàng đợi
        Queue queue= new LinkedList();

        //tạo stack rỗng
        Stack Stack =new Stack<>();

        //sử dụng hàm for để đưa các phần tử vào Stack
        for (int i = 0; i < value.length() ; i++) {
            Stack.push(value.charAt(i));
        }
        //sử dụng hàm for đưa các phần tử vào queue
        for (int i =0;i < value.length()-1;i++){
            queue.add(value.charAt(i));
        }

        //Hàm kiểm tra palindorme
        //lấy các phần tử của stack và queue so sánh với nhau thông qua equals của java(học được trên mạng,tự tìm hiểu nhá)
        //tạo một biến palindrome ==true để xét
        boolean isPalindrome = true;
        //xét từng phaafn tử của queue và stack
        while (!queue.isEmpty()) {
            if (queue.remove().equals(Stack.pop())){
                continue;
            } else {
                isPalindrome=false;
                break;
            }
        }
        if (!isPalindrome) {
            System.out.println("Không phải Palindrome");
        } else {
            System.out.println("Palindrome");
        }
    }
}
