package Case_Study.Model.dichvuphong;

public abstract class Facility {
    private String service;// Dịch vụ
    private String usablearea; //Diện tích sử dụng
    private String rentalcosts; //Chi phí thuê
    private String maxpeople;//Người tối đa
    private String leaseterm;//Thời hạn thuê

    //hàm ko có tham số
    public Facility(){

    }
    //hàm có tham số
    public Facility(String service, String usablearea, String rentalcosts, String maxpeople, String leaseterm) {
        this.service = service;
        this.usablearea = usablearea;
        this.rentalcosts = rentalcosts;
        this.maxpeople = maxpeople;
        this.leaseterm = leaseterm;
    }

    //get và set của từng thuộc tính
    //service


    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public String getUsablearea() {
        return usablearea;
    }

    public void setUsablearea(String usablearea) {
        this.usablearea = usablearea;
    }

    public String getRentalcosts() {
        return rentalcosts;
    }

    public void setRentalcosts(String rentalcosts) {
        this.rentalcosts = rentalcosts;
    }

    public String getMaxpeople() {
        return maxpeople;
    }

    public void setMaxpeople(String maxpeople) {
        this.maxpeople = maxpeople;
    }

    public String getLeaseterm() {
        return leaseterm;
    }

    public void setLeaseterm(String leaseterm) {
        this.leaseterm = leaseterm;
    }
    public abstract String getinfor();

    @Override
    public String toString() {
        return "Facility{" +
                "service='" + service + '\'' +
                ", usablearea='" + usablearea + '\'' +
                ", rentalcosts='" + rentalcosts + '\'' +
                ", maxpeople='" + maxpeople + '\'' +
                ", leaseterm='" + leaseterm + '\'' +
                '}';
    }

}
