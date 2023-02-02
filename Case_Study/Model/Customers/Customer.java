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
}
