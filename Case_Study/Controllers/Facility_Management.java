package Case_Study.Controllers;

import java.util.Scanner;

public class Facility_Management {
    public static void displayMainMenu() {
        int choice;
        Scanner prompt = new Scanner(System.in);
        do {
            System.out.println("1. Display list facility");
            System.out.println("2. Add new facility");
            System.out.println("3. Display list facility maintenance");
            System.out.println("4. Return main menu");
            choice = prompt.nextInt();
            switch (choice) {
                case 1:
                    break;
            }
        } while (choice != 4);
    }
}
