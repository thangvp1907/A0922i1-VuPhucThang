package Case_Study.services.customer;

import Case_Study.Model.Customers.Customer;
import Case_Study.services.customer.cusTomerService;

import java.util.LinkedList;
import java.util.Scanner;

public class cusTomerServiceImpl implements cusTomerService {
    LinkedList<Customer> list = new LinkedList<>();
    @Override
    public void addNew() {
        Customer customer = new Customer();
        customer.input();
        list.add(customer);

    }
    @Override
    public void disPlay() {
        for(Customer c : list){
            c.output();
        }
    }

    @Override
    public void edit() {
        Scanner prompt = new Scanner(System.in);
        System.out.println("Nhập Case_Study.services.customer code: ");
        int code = prompt.nextInt();
        int dem =0;
        for(Customer e : list){
            if(code == e.getCustomerCode()){
                System.out.println("Lựa chọn để sửa thông tin");
                int choice;
                Scanner prompt2 = new Scanner(System.in);
                do{
                    System.out.println("1. Họ và Tên");
                    System.out.println("2. Ngày sinh");
                    System.out.println("3. Giới tính");
                    System.out.println("4. Address");
                    System.out.println("5. Numberid");
                    System.out.println("6. Numberphone");
                    System.out.println("7. Email");
                    System.out.println("8. Customer Type");
                    System.out.println("0. Thoát");
                    choice= prompt2.nextInt();
                    prompt2.nextLine();
                    switch (choice){
                        case 1: {
                            System.out.println("Sửa tên: ");
                            String editname = prompt2.nextLine();
                            e.setFullname(editname);
                            break;
                        }
                        case 2: {
                            System.out.println("Sửa ngày sinh: ");
                            int editDayOfBirth = prompt2.nextInt();
                            prompt2.nextLine();
                            e.setDate(editDayOfBirth);
                            break;
                        }
                        case 3: {
                            System.out.println("Sửa giới tính: ");
                            String editGender = prompt2.nextLine();
                            e.setGender(editGender);
                            break;
                        }
                        case 4: {
                            System.out.println("Sửa địa chỉ: ");
                            String editAddress = prompt2.nextLine();
                            e.setAddress(editAddress);
                            break;
                        }
                        case 5: {
                            System.out.println("Sửa numberId: ");
                            int editNumberId = prompt2.nextInt();
                            e.setNumberid(editNumberId);
                            break;
                        }
                        case 6: {
                            System.out.println("Sửa numberphone:  ");
                            int editNumberPhone = prompt2.nextInt();
                            e.setNumberphone(editNumberPhone);
                            break;
                        }
                        case 7: {
                            System.out.println("Sửa Email: ");
                            String editEmail = prompt2.nextLine();
                            e.setEmail(editEmail);
                            break;
                        }
                        case 8: {
                            System.out.println("Sửa loại khách hàng: ");
                            String editClient = prompt2.nextLine();
                            e.setClient(editClient);
                            break;
                        }
                        case 0: {
                            break;
                        }
                    }
                }while (choice != 0);
            }
        }
        if (dem == 0){
            System.out.println("Không có");
        }
    }
}
