package Case_Study.Model.dichvuphong;

public class Room extends Facility {
    private String Freeserviceincluded;

    //hàm ko có tham số
    public Room() {

    }

    @Override
    public String getinfor() {
        return null;
    }

    //hàm có tham số

    public Room(String service, String usablearea, String rentalcosts, String maxpeople, String leaseterm, String freeserviceincluded) {
        super(service, usablearea, rentalcosts, maxpeople, leaseterm);
        Freeserviceincluded = freeserviceincluded;
    }


    public String getFreeserviceincluded() {
        return Freeserviceincluded;
    }

    public void setFreeserviceincluded(String freeserviceincluded) {
        Freeserviceincluded = freeserviceincluded;
    }

    @Override
    public String toString() {
        return "Room{" +
                "service='" + getService() + '\'' +
                ", usablearea='" + getUsablearea() + '\'' +
                ", rentalcosts='" + getRentalcosts() + '\'' +
                ", maxpeople='" + getMaxpeople() + '\'' +
                ", leaseterm='" + getLeaseterm() + '\'' +
                ",Freeserviceincluded='" + Freeserviceincluded + '\'' +
                '}';
    }
}
