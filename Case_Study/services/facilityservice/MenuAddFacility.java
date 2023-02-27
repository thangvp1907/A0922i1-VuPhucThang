package Case_Study.services.facilityservice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuAddFacility {
    static facilityServiceImpl facilityService = new facilityServiceImpl();
    public static void menuAdd(){
        Scanner prompt = new Scanner(System.in);
        int choice = 0;
        do{
            System.out.println("---Lựa chọn thêm dịch vụ--- "
                    +"\n"+"1.Add new villa"
                    +"\n"+"2.Add new House"
                    +"\n"+"3.Add new Room"
                    +"\n"+"0.Return menu");
            try{
                choice = prompt.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Nhập lại số");
            }
            switch (choice){
                case 1:{
                    facilityService.addVilla();
                    break;
                }
                case 2:{
                    facilityService.addHouse();
                }
                case 3:{
                    facilityService.addRoom();
                    break;
                }
                case 0:{
                    return;
                }
                default:{
                    System.out.println("bạn đã nhập sai yêu cầu");
                }
            }
        }while (choice != 4);
    }
}
