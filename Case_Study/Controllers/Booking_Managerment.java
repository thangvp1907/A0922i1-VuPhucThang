package Case_Study.Controllers;

import java.util.Scanner;

public class Booking_Managerment {
    public static void displayMainMenu(){
        int choice;
        Scanner prompt = new Scanner(System.in);
        do {
            System.out.println("1. Add new Case_Study.services.booking");
            System.out.println("2. Display list Case_Study.services.booking");
            System.out.println("3. Create new constracts");
            System.out.println("4. Display list contracts");
            System.out.println("5. Edit contracts");
            System.out.println("6. Return main menu");
            choice = prompt.nextInt();
            switch (choice) {
                case 1:
                    break;
            }
        } while (choice != 6);
    }
}
