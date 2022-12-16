package Docsothanhchu;

import java.util.Scanner;

public class Docsothanhchu {
    public static void main(String[] args) {
        System.out.println("nhap so ");
        Scanner prompt= new Scanner(System.in);
        int Number= prompt.nextInt();
//        int ones= (Number);
//        int tens=(Number%10);
      if(Number<=10) {
          switch (Number) {
              case 1:
                  System.out.println("Một");
                  break;
              case 2:
                  System.out.println("Hai");
                  break;
              case 3:
                  System.out.println("Ba");
                  break;
              case 4:
                  System.out.println("Bốn");
                  break;
              case 5:
                  System.out.println("Năm");
                  break;
              case 6:
                  System.out.println("Sáu");
                  break;
              case 7:
                  System.out.println("Bảy");
                  break;
              case 8:
                  System.out.println("Tám");
                  break;
              case 9:
                  System.out.println("Chín");
                  break;
              case 10:
                  System.out.println("Mười");
                  break;
          }
      }else {
        switch (Number){
            case 1:
                System.out.println("MƯời one");
                break;
            case 2:
                System.out.println("MƯƯời Two");
                break;
            case 3:
                System.out.println("Mười Ba");
                break;
            case 4:
                System.out.println("Mười Bốn");
                break;
            case 5:
                System.out.println("Mười Lăm");
                break;
            case 6:
                System.out.println("Mười Sáu");
                break;
            case 7:
                System.out.println(" Mười Bảy");
                break;
            case 8:
                System.out.println(" MƯời Tám");
                break;
            case 9:
                System.out.println("Mười Chín");
                break;
            default:
                System.out.println("Hai mươi");
        }
      }
//        switch (tens+ones){
//            case 1:
//                System.out.println(" hai mươi mốt");
//                break;
//            case 2:
//                System.out.println("Hai");
//                break;
//            case 3:
//                System.out.println("Ba");
//                break;
//            case 4:
//                System.out.println("Bốn");
//                break;
//            case 5:
//                System.out.println("Năm");
//                break;
//            case 6:
//                System.out.println("Sáu");
//                break;
//            case 7:
//                System.out.println("Bảy");
//                break;
//            case 8:
//                System.out.println("Tám");
//                break;
//            case 9:
//                System.out.println("Chín");
//                break;
//            case 10:
//                System.out.println("Mười");
//                break;
//            }
        }
    }
