package Case_Study.Model.dichvuphong;

public class House extends Facility{
    protected String roomstandard;// tiêu chuẩn phòng
    protected int numberoffloors; //Số tầng
    //hàm không có tham số
    public House() {

    }
    //hàm có tham số

    public House(String service, double usablearea, double rentalcosts, int maxpeople, String leaseterm,String roomstandard,int numberoffloors) {
        super(service, usablearea, rentalcosts, maxpeople, leaseterm);
        this.numberoffloors=numberoffloors;
        this.roomstandard=roomstandard;
    }
    //set và get của thuộc tính
    //Roomstandard
    public String getRoomstandard() {
        return roomstandard;
    }
    public void setRoomstandard(String roomstandard) {
        this.roomstandard = roomstandard;
    }
    //numberoffloors
    public int getNumberoffloors() {
        return numberoffloors;
    }
    public void setNumberoffloors(int numberoffloors) {
        this.numberoffloors = numberoffloors;
    }
}
