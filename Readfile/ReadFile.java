package Readfile;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {

    public static final String DELIMITER = ",";

    public void readToFile(String path){
        List<Country> list = new ArrayList<>();
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(path))){
            String line = "";
            while ((line = bufferedReader.readLine())!= null) {
//                if (line.trim().equals("")) {
//                    continue;
//                }
                String[] result = line.trim().split(DELIMITER);
                Country temp = new Country(result);
                list.add(temp);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        list.forEach(System.out::println);
    }
}
