package ProductFile;

import java.io.FileNotFoundException;
import java.util.List;

public class Test {
    public static void main(String[] args) throws FileNotFoundException {
        readBinary readBinary = new readBinary();
        List<Product> list = readBinary.readProduct("C:\\Users\\Admin\\Desktop\\New Text Document.txt");
        list.forEach(System.out::println);
        readBinary.writerProduct("src/ProductFile/producthoanchinh.txt",list);
//        readBinary.searchProduct("src/ProductFile/producthoanchinh.txt");
    }
}
