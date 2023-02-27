package ProductFile;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        readBinary2 readBinary2 = new readBinary2();
        List<Product> list = new ArrayList<>();
        String path ="C:\\Users\\Admin\\Desktop\\New Text Document (2).txt";
        list.add(new Product("1","áo","éo vì","200.000VNĐ","Tấn ngokngek"));
        list.add(new Product("2","quần","éo vì","10.000VNĐ","Nghĩa ngokngek"));
        readBinary2.readOject(path).forEach(System.out::println);
        readBinary2.writeObject(path,list);
//        readBinary2.search(path,"áo");
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Nhập vaofd đường dẫn: ");
//        String path =scanner.nextLine();
        System.out.println("Nhập vào tên: ");
        String name = scanner.nextLine();
//        System.out.println("list: ");
//        readBinary2.readOject(path).forEach(System.out::println);
//        readBinary2.writeObject(path,list);
        readBinary2.search(path,name);


    }
}
