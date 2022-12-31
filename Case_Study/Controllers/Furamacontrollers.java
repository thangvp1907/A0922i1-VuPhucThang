package Case_Study.Controllers;

import java.util.Scanner;

public class Furamacontrollers {
    public void displayMainMenu() {
        int choice;
        Scanner prompt = new Scanner(System.in);
        do {
            System.out.println("1. Employee Management");
            System.out.println("2. Customer Management");
            System.out.println("3. Facility Management");
            System.out.println("4. Booking Management");
            System.out.println("5. Promotion Management");
            System.out.println("6. Exit");
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
                    Booking_Managerment.displayMainMenu();
                    break;
                case 5:
                    Promotion_Management.displayMenu();
                    break;
                case 6:
                    break;
            }
        } while (choice != 6);
    }

    public static void main(String[] args) {
        Furamacontrollers fuma =new Furamacontrollers();
        fuma.displayMainMenu();
    }
}

