package Case_Study.Controllers;

import java.util.Scanner;

public class Booking_Managerment {
    public static void displayMainMenu(){
        int choice;
        Scanner prompt = new Scanner(System.in);
        do {
            System.out.println("1. Add new booking");
            System.out.println("2. Display list booking");
            System.out.println("3. Create new constracts");
            System.out.println("4. Display list contracts");
            System.out.println("5. Edit contracts");
            System.out.println("6. Return main menu");
            choice = prompt.nextInt();
            switch (choice) {
                case 1:
                    Emloyee_Management.displayMainMenu();
                    break;
                case 2:
                    Customer_Management.displayMainMenu();
                    break;
                case 3:
                    Facility_Management.displayMainMenu();
                    break;
                case 4:


            }
        } while (choice != 6);
    }
}
