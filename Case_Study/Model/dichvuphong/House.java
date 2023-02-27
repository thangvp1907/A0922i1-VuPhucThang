package Case_Study.Model.dichvuphong;

public class House extends Facility{
    protected String roomstandard;// tiêu chuẩn phòng
    protected String numberoffloors; //Số tầng
    //hàm không có tham số
    public House() {

    }

    @Override
    public String getinfor() {
        return null;
    }
    //hàm có tham số


    public House(String service, String usablearea, String rentalcosts, String maxpeople, String leaseterm, String roomstandard, String numberoffloors) {
        super(service, usablearea, rentalcosts, maxpeople, leaseterm);
        this.roomstandard = roomstandard;
        this.numberoffloors = numberoffloors;
    }

    public String getRoomstandard() {
        return roomstandard;
    }

    public void setRoomstandard(String roomstandard) {
        this.roomstandard = roomstandard;
    }

    public String getNumberoffloors() {
        return numberoffloors;
    }

    public void setNumberoffloors(String numberoffloors) {
        this.numberoffloors = numberoffloors;
    }

    @Override
    public String toString() {
        return "House{" +
                "service='" + getService() + '\'' +
                ", usablearea='" + getUsablearea() + '\'' +
                ", rentalcosts='" + getRentalcosts() + '\'' +
                ", maxpeople='" + getMaxpeople() + '\'' +
                ", leaseterm='" + getLeaseterm() + '\'' +
                ",roomstandard='" + roomstandard + '\'' +
                ", numberoffloors='" + numberoffloors + '\'' +
                '}';
    }
}
