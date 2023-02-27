package Readfile;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Country> country = new ArrayList<>();
        ReadFile readFile = new ReadFile();
        readFile.readToFile("C:\\Users\\Admin\\Desktop\\New Text Document.txt");
    }
}
