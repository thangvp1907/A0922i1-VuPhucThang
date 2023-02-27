package Case_Study.services.facilityservice;

import Case_Study.Model.dichvuphong.Facility;
import Case_Study.Model.dichvuphong.Villa;

import java.util.*;

public class facilityServiceImpl implements IFacilityService {
    @Override
    public void displayService() {
        Scanner prompt = new Scanner(System.in);
        System.out.println("Nhập tên dịch vụ");
        String name = prompt.nextLine().toLowerCase();
        System.out.println("-----Danh sách dịch vụ-----");
        Map<Facility, Integer> villaIntegerMap = ReadWriteFacility.readFacilities("src/Case_Study/services/facilityservice/Danhsachdichvu.tcx");
        for (Facility str : villaIntegerMap.keySet()) {
            if(str.getService().equals(name)){
                System.out.println(str.toString());
            }
        }
    }

    @Override
    public void addVilla() {
        Map<Facility, Integer> villalist;
        System.out.println("Thêm thành công 1");
    }

    @Override
    public void addHouse() {
        System.out.println("Thêm thành công 2");
    }

    @Override
    public void addRoom() {
        System.out.println("Thêm thành công 3");
    }

    @Override
    public void displayMaintenance() {

    }
}
