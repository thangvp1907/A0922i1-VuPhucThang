package Case_Study.Model.dichvuphong;

public class Room extends Facility {
    private String Freeserviceincluded;

    //hàm ko có tham số
    public Room() {

    }

    //hàm có tham số

    public Room(String service, double usablearea, double rentalcosts, int maxpeople, String leaseterm, String freeserviceincluded) {
        super(service, usablearea, rentalcosts, maxpeople, leaseterm);
        this.Freeserviceincluded = freeserviceincluded;
    }

    //set và get của thuộc tính
    //Freeserviceincluded
    public String getFreeserviceincluded() {
        return Freeserviceincluded;
    }
    public void setFreeserviceincluded(String freeserviceincluded) {
        Freeserviceincluded = freeserviceincluded;
    }
}
