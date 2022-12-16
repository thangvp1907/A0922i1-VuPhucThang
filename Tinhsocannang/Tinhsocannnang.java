package Tinhsocannang;

import java.util.Scanner;

public class Tinhsocannnang {
    public static void main(String[] args) {
        Scanner prompt1 = new Scanner(System.in);
        double height,weight,bmi;
        System.out.println("nhap chieu cao");
        height= prompt1.nextDouble();
        System.out.println("nhap can nang");
        weight=prompt1.nextDouble();
        bmi = weight / Math.pow(height, 2);
        System.out.println(bmi);

        if(bmi <18.5){
            System.out.println("Underweight");
        } else if (bmi <25) {
            System.out.println("Normal");
        } else if (bmi<30) {
            System.out.println("Overweight");
        }else {
            System.out.println("Obese");
        }
    }
}
