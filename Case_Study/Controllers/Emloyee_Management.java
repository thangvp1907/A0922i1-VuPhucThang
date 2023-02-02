package Case_Study.Controllers;

import Case_Study.Model.Customers.Employee;
import Case_Study.services.EmployeeServiceImpl;

import java.util.Scanner;

public class Emloyee_Management {
    public static void displayMainMenu() {
        EmployeeServiceImpl employee = new EmployeeServiceImpl();
        int choice;
        Scanner prompt = new Scanner(System.in);
        do {
            System.out.println("1. Display list employee");
            System.out.println("2. Add new employee");
            System.out.println("3. Edit emloyee");
            System.out.println("4. Return main menu");
            choice = prompt.nextInt();
            switch (choice) {
                case 1: {
                    employee.disPlay();
                    break;
                }

                case 2: {
                    employee.addNew();
                    break;
                }
                case 3: {
                    employee.edit();
                    break;
                }
            }
        } while (choice != 4);
    }
}
