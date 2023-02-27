package Case_Study.services.facilityservice;

import Case_Study.Model.dichvuphong.Facility;
import Case_Study.Model.dichvuphong.House;
import Case_Study.Model.dichvuphong.Room;
import Case_Study.Model.dichvuphong.Villa;

import javax.xml.ws.Holder;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ReadWriteFacility {
    private static List<String> readFiles(String path) {
        List<String> list = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                list.add(line.trim());
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }

    public static Map<Facility, Integer> readFacilities(String path) {
//        Map<Facility, Integer> readFacilityMap = new LinkedHashMap<>();
//        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
//            String line = "";
//            while ((line = bufferedReader.readLine()) != null) {
//                String[] facility = line.trim().split(",");
//                Facility facilitylist = new Villa(
//                        facility[0]
//                        , facility[1]
//                        , facility[2]
//                        , facility[3]
//                        , facility[4]
//                        , facility[5]
//                        , facility[6]
//                        , facility[7]
//                );
//                readFacilityMap.put(facilitylist,1);
//            }
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//        return readFacilityMap;

        List<String> strings = readFiles(path);
        Map<Facility, Integer> facilityIntegerMap = new LinkedHashMap<>();
        String[] infor;
        for (String line : strings) {
            infor = line.split(",");
            if (infor.length == 8) {
                facilityIntegerMap.put(new Villa(infor[0],
                        infor[1] ,
                        infor[2],
                        infor[3],
                        infor[4],
                        infor[5],
                        infor[6],
                        infor[7]),0);
            }else if (infor.length == 7){
                facilityIntegerMap.put(new House(infor[0],
                        infor[1],
                        infor[2],
                        infor[3],
                        infor[4],
                        infor[5],
                        infor[6]),0);
            }else if (infor.length == 6 ){
                facilityIntegerMap.put(new Room(infor[0],
                        infor[1],
                        infor[2],
                        infor[3],
                        infor[4],
                        infor[5]),0);
            }
        }
        return facilityIntegerMap;
    }
}
