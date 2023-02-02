package Case_Study.Controllers;

import java.util.Scanner;

public class Promotion_Management {
    public static void displayMenu(){
        int choice;
        Scanner prompt = new Scanner(System.in);
        do {
            System.out.println("1. Display list customers use service");
            System.out.println("2. Display list customers get voucher");
            System.out.println("3. Return main menu");
            choice = prompt.nextInt();
            switch (choice) {
                case 1:
                    break;
            }
        } while (choice != 3);
    }
}
