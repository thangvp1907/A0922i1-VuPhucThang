package Case_Study.Controllers;

import Case_Study.services.facilityservice.IFacilityService;
import Case_Study.services.facilityservice.MenuAddFacility;
import Case_Study.services.facilityservice.facilityServiceImpl;


import java.util.Scanner;

public class Facility_Management  {
    static facilityServiceImpl facilityService = new facilityServiceImpl();

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
                case 1: {
                    facilityService.displayService();
                    break;
                }
                case 2:{
                    MenuAddFacility.menuAdd();
                    break;
                }
            }
        } while (choice != 4);
    }
}
