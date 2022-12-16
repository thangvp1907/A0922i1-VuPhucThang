package Baitap.index;

import java.util.Scanner;

public class js {
    public static void main(String[] args) {
        System.out.println("Nhap PT");
        System.out.println("a*x+b=c ");
        Scanner scanner=new Scanner(System.in);

        System.out.print("a: ");
        double a =scanner.nextDouble();

        System.out.print("b: ");
        double b =scanner.nextDouble();

        System.out.print("c: ");
        double c =scanner.nextDouble();

        if(a !=0){
            double answer =(c-b)/a;
            System.out.printf("Equation pass with x = \n", answer);
        }else {
            if (b==c){
                System.out.println("the solution is all x!");
            }else {
                System.out.println("No solution");
            }
        }
    }
}
