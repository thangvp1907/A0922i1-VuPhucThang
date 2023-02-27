package Case_Study.Model.dichvuphong;

public class Villa extends Facility {
    private String roomstandard;// tiêu chuẩn phòng
    private String swimmingpoolarea;//Diện tích hồ bơi
    private String numberoffloors; //Số tầng

    //hàm ko có tham số
    public Villa() {

    }

    @Override
    public String getinfor() {
        return null;
    }

    //hàm có tham số kế thừa Facility

    public Villa(String service, String usablearea, String rentalcosts, String maxpeople, String leaseterm, String roomstandard, String swimmingpoolarea, String numberoffloors) {
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

    public String getSwimmingpoolarea() {
        return swimmingpoolarea;
    }

    public void setSwimmingpoolarea(String swimmingpoolarea) {
        this.swimmingpoolarea = swimmingpoolarea;
    }

    public String getNumberoffloors() {
        return numberoffloors;
    }

    public void setNumberoffloors(String numberoffloors) {
        this.numberoffloors = numberoffloors;
    }

    @Override
    public String toString() {
        return "Villa{" +
                "service='" + getService() + '\'' +
                ", usablearea='" + getUsablearea() + '\'' +
                ", rentalcosts='" + getRentalcosts() + '\'' +
                ", maxpeople='" + getMaxpeople() + '\'' +
                ", leaseterm='" + getLeaseterm() + '\'' +
                ",roomstandard='" + roomstandard + '\'' +
                ", swimmingpoolarea='" + swimmingpoolarea + '\'' +
                ", numberoffloors='" + numberoffloors + '\'' +
                '}';
    }

}
