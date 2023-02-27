package Case_Study.Model.Customers;

import java.util.Scanner;

public class Customer extends Person{
    private int customerCode;
    private String client;
    private String address;


    public Customer() {
    }

    public Customer(int code, String fullname, int date, String gender, double numberid, int numberphone, String email, int customerCode, String client, String address) {
        super(code, fullname, date, gender, numberid, numberphone, email);
        this.customerCode = customerCode;
        this.client = client;
        this.address = address;
    }

    //set và get
    public int getCustomerCode() {
        return customerCode;
    }
    public void setCustomerCode(int customerCode) {
        this.customerCode = customerCode;
    }

    public String getClient() {
        return client;
    }
    public void setClient(String client) {
        this.client = client;
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }


    public void input(){
        Scanner prompt = new Scanner(System.in);

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


        System.out.println("Custom code: ");
        int Customcode = prompt.nextInt();
        prompt.nextLine();
        this.setCustomerCode(Customcode);


        System.out.println("Loại khách hàng: ");
        String client = prompt.nextLine();
        this.setClient(client);


        System.out.println("Địa chỉ ");
        String address = prompt.nextLine();
        this.setAddress(address);
    }
    public void output() {
        System.out.println("MS khách hàng: " + this.getCustomerCode()
                + "\n" + "numberId: "
                + this.getNumberid()
                + "\n" + "Ten: "
                + this.getFullname()
                + "\n" + "Ngày sinh: "
                + this.getDate()
                + "\n" + "Giới tính: "
                + this.getGender()
                + "\n" + "address: "
                + this.getAddress()
                + "\n" + "numberPhone"
                + this.getNumberphone()
                + "\n" + "Email: "
                + this.getEmail()
                + "\n" + "Customer type: "
                + this.getClient()
        );
    }
}
