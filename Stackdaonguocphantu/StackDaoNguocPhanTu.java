package Stackdaonguocphantu;


import java.util.Scanner;

public class StackDaoNguocPhanTu {
    private int arr[];
    private int size;
    private int index;

    public StackDaoNguocPhanTu(int size) {
        this.size = size;
        arr =new int[size];
    }

    //Kiểm tra stack full chưa
    public boolean isfull(){
        return index ==size;
    }
    //Kiểm tra có rỗng ko
    public  boolean isEmpty(){
        return index ==0;
    }

    //push thêm mới vào
    public void push(int E){
        if(isfull()){
            System.out.println("list đã đầy");
            return;
        }
        arr[index] = E ;
        index++;
    }
    //pop đưa phần tử ra khỏi list
    public int pop(){
        if(isEmpty()){
            System.out.println("Không có phần tử");
            return 0 ;
        }
        int result = arr[--index];
        arr[index]=0;
        return result;
    }

    public void display(){
        for (int i : arr){
            System.out.print(i +" ");
        }
        System.out.println(" ");
    }

    public static void main(String[] args) {
        StackDaoNguocPhanTu s =new StackDaoNguocPhanTu(5);
        StackDaoNguocPhanTu s1 =new StackDaoNguocPhanTu(5);
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        s.display();
        for (int i = 0; i <s.arr.length ; i++) {
            s1.push(s.pop());
        }
        s1.display();
    }
}
