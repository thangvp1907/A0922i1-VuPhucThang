package Case_Study.Model.booking;

public class contract{
    private int numberContract;
    private int moneyDeposit;
    private int totalPayment;
    private int bookingCode;

    private int customerCode;


    public contract() {
    }

    public contract(int bookingCode, int numberContract, int moneyDeposit, int totalPayment,int customerCode) {
        this.customerCode=customerCode;
        this.bookingCode=bookingCode;
        this.numberContract = numberContract;
        this.moneyDeposit = moneyDeposit;
        this.totalPayment = totalPayment;
    }

    //set và get
    public int getNumberContract() {
        return numberContract;
    }
    public void setNumberContract(int numberContract) {
        this.numberContract = numberContract;
    }

    public int getMoneyDeposit() {
        return moneyDeposit;
    }
    public void setMoneyDeposit(int moneyDeposit) {
        this.moneyDeposit = moneyDeposit;
    }

    public int getTotalPayment() {
        return totalPayment;
    }
    public void setTotalPayment(int totalPayment) {
        this.totalPayment = totalPayment;
    }

    public int getBookingCode() {
        return bookingCode;
    }
    public void setBookingCode(int bookingCode) {
        this.bookingCode = bookingCode;
    }

    public int getCustomerCode() {
        return customerCode;
    }
    public void setCustomerCode(int customerCode) {
        this.customerCode = customerCode;
    }
}
