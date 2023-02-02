package Case_Study.services;

import Case_Study.Model.Customers.Employee;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeServiceImpl implements employeeservice {
    ArrayList<Employee> list = new ArrayList<>();

    @Override
    public void disPlay() {
        for (Employee e : list) {
            e.output();
        }
    }

    @Override
    public void addNew() {
        Employee employee = new Employee();
        employee.input();
        list.add(employee);
    }

    @Override
    public void edit() {
        System.out.println("Nhập mã số Emloyee muốn sửa: ");
        Scanner prompt = new Scanner(System.in);
        int maSo = prompt.nextInt();
        int dem = 0;
        for (Employee e : list) {
            if (maSo == e.getCode()) {
                dem++;
                System.out.println("GIỜ MUỐN SỬ CÁI GÌ CHỌN ĐI !!!!");
                int choice;
                Scanner prompt2 = new Scanner(System.in);
                do {
                    System.out.println("1. Họ và Tên");
                    System.out.println("2. Ngày sinh");
                    System.out.println("3. Giới tính");
                    System.out.println("4. Numberid");
                    System.out.println("5. Numberphone");
                    System.out.println("6. Email");
                    System.out.println("7. Salary");
                    System.out.println("8. Vị trí");
                    System.out.println("9. Trình độ");
                    System.out.println("0. Thoát");
                    choice = prompt2.nextInt();
                    prompt2.nextLine();
                    switch (choice) {
                        case 1: {
                            System.out.print("Sửa tên thành gì: ");
                            String editName = prompt2.nextLine();
                            e.setFullname(editName);
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
                            System.out.println("Sửa numberId: ");
                            int editNumberId = prompt2.nextInt();
                            e.setNumberid(editNumberId);
                            break;
                        }
                        case 5: {
                            System.out.println("Sửa numberphone:  ");
                            int editNumberPhone = prompt2.nextInt();
                            e.setNumberphone(editNumberPhone);
                            break;
                        }
                        case 6: {
                            System.out.println("Sửa Email: ");
                            String editEmail = prompt2.nextLine();
                            e.setEmail(editEmail);
                            break;
                        }
                        case 7: {
                            System.out.println("Sửa Salary: ");
                            double editSalary = prompt2.nextDouble();
                            e.setSalary(editSalary);
                            break;
                        }
                        case 8: {
                            System.out.println("Sửa Vị trí: ");
                            String editVitri = prompt2.nextLine();
                            e.setVitri(editVitri);
                            break;
                        }
                        case 9: {
                            System.out.println("Sửa trình độ: ");
                            String editTrinhDo = prompt2.nextLine();
                            e.setTrinhdo(editTrinhDo);
                            break;
                        }
                        case 0:
                            break;
                    }
                } while (choice != 0);
            }
        }
        if (dem == 0) {
            System.out.println("không có");
        }
    }
}