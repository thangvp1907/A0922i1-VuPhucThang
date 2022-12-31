package Case_Study.Model;

public class Villa extends Facility {
    private String roomstandard;// tiêu chuẩn phòng
    private double swimmingpoolarea;//Diện tích hồ bơi
    private int numberoffloors; //Số tầng

    //hàm ko có tham số
    public Villa() {
    }
    //hàm có tham số kế thừa Facility
    public Villa(String service, double usablearea, double rentalcosts, int maxpeople, String leaseterm, String roomstandard, double swimmingpoolarea, int numberoffloors) {
        super(service, usablearea, rentalcosts, maxpeople, leaseterm);
        this.roomstandard = roomstandard;
        this.swimmingpoolarea = swimmingpoolarea;
        this.numberoffloors = numberoffloors;
    }
    //set và get của các thuộc tính
    //Tiêu chuẩn phòng
    public String getRoomstandard() {
        return roomstandard;
    }
    public void setRoomstandard(String roomstandard) {
        this.roomstandard = roomstandard;
    }
    //Diện tích hồ bơi
    public double getSwimmingpoolarea() {
        return swimmingpoolarea;
    }
    public void setSwimmingpoolarea(double swimmingpoolarea) {
        this.swimmingpoolarea = swimmingpoolarea;
    }
    //Số tầng
    public int getNumberoffloors() {
        return numberoffloors;
    }
    public void setNumberoffloors(int numberoffloors) {
        this.numberoffloors = numberoffloors;
    }
}
