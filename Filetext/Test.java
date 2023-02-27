package Filetext;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<String> list = FileText.readFile("C:\\Users\\Admin\\Desktop\\New Text Document.txt");
        list.forEach(System.out::println);
        FileText.writeFile("    src/Filetext/student.dat",list);
    }
}
