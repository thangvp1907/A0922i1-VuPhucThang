package Case_Study.Controllers;

import java.util.Scanner;
public class Customer_Management {
    public static void displayMainMenu() {
        int choice;
        Scanner prompt = new Scanner(System.in);
        do {
            System.out.println("1. Display list customers");
            System.out.println("2. Add new customer");
            System.out.println("3. Edit customer");
            System.out.println("4. Return main menu");;
            choice = prompt.nextInt();
            switch (choice) {
                case 1:
                    break;
            }
        } while (choice != 4);
    }
}
