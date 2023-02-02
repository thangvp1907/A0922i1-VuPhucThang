package Case_Study.Model.booking;

public class Booking {
    private   String booKingCode;
    private int dateStart;
    private int dateEnd;
    private int customerCode;
    private String serviceName;
    private String typeOfService;

    public Booking() {
    }

    public Booking(String booKingCode, int dateStart, int dateEnd, int customerCode, String serviceName, String typeOfService) {
        this.booKingCode = booKingCode;
        this.dateStart = dateStart;
        this.dateEnd = dateEnd;
        this.customerCode = customerCode;
        this.serviceName = serviceName;
        this.typeOfService = typeOfService;
    }

    //set va get

    public String getBooKingCode() {
        return booKingCode;
    }

    public void setBooKingCode(String booKingCode) {
        this.booKingCode = booKingCode;
    }

    public int getDateStart() {
        return dateStart;
    }

    public void setDateStart(int dateStart) {
        this.dateStart = dateStart;
    }

    public int getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(int dateEnd) {
        this.dateEnd = dateEnd;
    }

    public int getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(int customerCode) {
        this.customerCode = customerCode;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getTypeOfService() {
        return typeOfService;
    }

    public void setTypeOfService(String typeOfService) {
        this.typeOfService = typeOfService;
    }
}
