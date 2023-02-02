package Case_Study.Model.dichvuphong;

public abstract class Facility {
    private String service;// Dịch vụ
    private double usablearea; //Diện tích sử dụng
    private double rentalcosts; //Chi phí thuê
    private int maxpeople;//Người tối đa
    private String leaseterm;//Thời hạn thuê

    //hàm ko có tham số
    public Facility(){

    }
    //hàm có tham số
    public Facility(String service, double usablearea, double rentalcosts, int maxpeople, String leaseterm) {
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
    //usablearea
    public double getUsablearea() {
        return usablearea;
    }
    public void setUsablearea(double usablearea) {
        this.usablearea = usablearea;
    }
    //rentalcosts
    public double getRentalcosts() {
        return rentalcosts;
    }
    public void setRentalcosts(double rentalcosts) {
        this.rentalcosts = rentalcosts;
    }
    //Maxpeople
    public int getMaxpeople() {
        return maxpeople;
    }
    public void setMaxpeople(int maxpeople) {
        this.maxpeople = maxpeople;
    }
    //Leaseterm
    public String getLeaseterm() {
        return leaseterm;
    }
    public void setLeaseterm(String leaseterm) {
        this.leaseterm = leaseterm;
    }
}
