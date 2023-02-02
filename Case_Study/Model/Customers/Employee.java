package Case_Study.Model.Customers;

import java.util.Date;
import java.util.Scanner;

public class Employee extends Person {
    private String trinhdo;
    private String vitri;

    private double salary;

    public Employee() {

    }

    public Employee(int code, String fullname, int date, String gender, double numberid, double salary, int numberphone, String email, String trinhdo, String vitri) {
        super(code, fullname, date, gender, numberid, numberphone, email);
        this.trinhdo = trinhdo;
        this.vitri = vitri;
        this.salary = salary;
    }
    //set và get của các thuộc tính


    public String getTrinhdo() {
        return trinhdo;
    }

    public void setTrinhdo(String trinhdo) {
        this.trinhdo = trinhdo;
    }

    public String getVitri() {
        return vitri;
    }

    public void setVitri(String vitri) {
        this.vitri = vitri;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    //Input để nhập vào phần tử
    public void input() {
        Scanner prompt = new Scanner(System.in);
        System.out.println("Nhap MS: ");
        int code = prompt.nextInt();
        prompt.nextLine();
        this.setCode(code);

        System.out.println("Họ và tên");
        String fullName = prompt.nextLine();
        this.setFullname(fullName);

        System.out.println("Ngày sinh: ");
        int dayOfBirths = prompt.nextInt();
        prompt.nextLine();
        this.setDate(dayOfBirths);


        System.out.println("Giới tính: ");
        String gender = prompt.nextLine();
        this.setGender(gender);


        System.out.println("numberId: ");
        int numberid = prompt.nextInt();
        prompt.nextLine();
        this.setNumberid(numberid);


        System.out.println("Phone: ");
        int numberphone = prompt.nextInt();
        prompt.nextLine();
        this.setNumberphone(numberphone);


        System.out.println("Email: ");
        String email = prompt.nextLine();
        this.setEmail(email);


        System.out.println("Salary: ");
        double salary = prompt.nextDouble();
        prompt.nextLine();
        this.setSalary(salary);


        System.out.println("Vị trí: ");
        String position = prompt.nextLine();
        this.setVitri(position);


        System.out.println("Trình độ: ");
        String level = prompt.nextLine();
        this.setTrinhdo(level);

    }

    //Output in ra vào phần tử
    public void output() {
        System.out.println("MS: " + this.getCode()
                + "\n" + "Ten: "
                + this.getFullname()
                + "\n" + "Ngày sinh: "
                + this.getDate()
                + "\n" + "Giới tính: "
                + this.getGender()
                + "\n" + "numberId: "
                + this.getNumberid()
                + "\n" + "numberPhone"
                + this.getNumberphone()
                + "\n" + "Email: "
                + this.getEmail()
                + "\n" + "Salary: "
                + this.getSalary()
                + "\n" + "Vị trí: "
                + this.getVitri()
                + "\n" + "Trình độ: "
                + this.getTrinhdo()
                + "\n"
        );
    }
}


