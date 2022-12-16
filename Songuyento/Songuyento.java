package Songuyento;

import java.util.Scanner;

public class Songuyento {
        public static void main(String []args){
            System.out.println("nhap so");
            Scanner prompt = new Scanner(System.in);
            int number=prompt.nextInt();
            if(number<2){
                System.out.println("ko phai");
            }else {
                int i = 2;
                boolean check =true;
                while(i<=Math.sqrt(number)){
                    if(number % i==0){
                        check =false;
                        break;
                    };
                    i++;
                };
                if(check== false){
                    System.out.println("ko phai2");
                }else{
                    System.out.println("phai");
                };
            };
        };
}
