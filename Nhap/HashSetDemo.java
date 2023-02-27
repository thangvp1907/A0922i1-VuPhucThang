package Nhap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HashSetDemo {
    public static void main(String[] args) {
        SetDemo student1 = new SetDemo("A", "18", 1);
        SetDemo student2 = new SetDemo("B", "18", 2);
        SetDemo student3 = new SetDemo("C", "18", 3);

        Map<Integer, SetDemo> studentmap = new HashMap<Integer, SetDemo>();
        studentmap.put(6,student2);
        studentmap.put(1, student1);
        studentmap.put(2, student2);
        studentmap.put(3, student3);
        studentmap.put(4, student1);
        studentmap.put(5, student1);

        for (Map.Entry<Integer, SetDemo> student : studentmap.entrySet()) {
            System.out.println(student.toString());
        }

        System.out.println("----------------------------");

        Set<SetDemo> studentset = new HashSet<>();
        studentset.add(student3);
        studentset.add(student1);
        studentset.add(student2);
        studentset.add(student1);
        studentset.add(student3);

        for (SetDemo s : studentset ){
            System.out.println(s.toString());
        }
    }
}
