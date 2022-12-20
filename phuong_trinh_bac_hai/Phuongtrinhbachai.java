package phuong_trinh_bac_hai;

import java.util.Scanner;

public class Phuongtrinhbachai {
    public double giaTria;
    public double giaTrib;
    public double giaTric;

    public Phuongtrinhbachai() {
    }

    public Phuongtrinhbachai(double giaTria, double giaTrib, double giaTric) {
        this.giaTria = giaTria;
        this.giaTrib = giaTrib;
        this.giaTric = giaTric;
    }

    public void nhap () {
        Scanner prompta =new Scanner(System.in);
        System.out.print("nhập a");
        giaTria = prompta.nextDouble();
        System.out.print("nhập b");
        giaTrib = prompta.nextDouble();
        System.out.print("nhập c");
        giaTric = prompta.nextDouble();
    }
    public void quadraticequation(){
        if(giaTria == 0) {
            if (giaTrib == 0) {
                if (giaTric==0) {
                    System.out.println("Phương trình có vô số nghiệm");
                }
            }else{
                System.out.println("phương trình vô nghiệm");
            }
        }else {
            double delta = giaTrib*giaTrib - 4*giaTria*giaTric;
            if(delta <0){
                System.out.println("Phương trình vô nghiệm");
            } else if (delta == 0) {
                System.out.println("Phương trình có nghiệm kép: "+(-giaTrib/2*giaTria));
                
            }else {
                double x= ((-giaTrib)+Math.sqrt(delta))/(2*giaTria);
                double y= ((-giaTrib)-Math.sqrt(delta))/2*giaTria;
                System.out.println("phương trình có hai nghiệm: "+"\n"+ x +"\n"+ y);
            }
        }
    }
    public static void main(String[] args) {
        Phuongtrinhbachai doituong1 =new Phuongtrinhbachai();
        doituong1.nhap();
        doituong1.quadraticequation();
    }
}
