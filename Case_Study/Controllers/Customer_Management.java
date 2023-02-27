package Case_Study.Controllers;

import Case_Study.services.customer.cusTomerServiceImpl;

import java.util.Scanner;
public class Customer_Management {
    public static void displayMainMenu() {
        cusTomerServiceImpl cusTomerService = new cusTomerServiceImpl();
        int choice;
        Scanner prompt = new Scanner(System.in);
        do {
            System.out.println("1. Display list customers");
            System.out.println("2. Add new Case_Study.services.customer");
            System.out.println("3. Edit Case_Study.services.customer");
            System.out.println("4. Return main menu");;
            choice = prompt.nextInt();
            switch (choice) {
                case 1:
                    cusTomerService.disPlay();
                    break;
                case 2:
                    cusTomerService.addNew();
                    break;
                case 3:
                    cusTomerService.edit();
                    break;
            }
        } while (choice != 4);
    }
}
