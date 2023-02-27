package ProductFile;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.nio.charset.StandardCharsets.*;

public class readBinary {
    public static final String REGEX = "";


    public static void writerProduct(String path, List<Product> readProduct) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path))) {
            for (Product product : readProduct) {
                bufferedWriter.write(product.toStringFile());
                bufferedWriter.write("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Product> readProduct(String path) {
        List<Product> listProduct = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                String[] product = line.trim().split(REGEX);
                Product productlist = new Product(
                        product[0]
                        , product[1]
                        , product[3]
                        , product[4]
                        , product[5]
                );
                listProduct.add(productlist);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return listProduct;
    }

//    public static void searchProduct(String path) throws FileNotFoundException {
//        List<Product> products = readProduct(path);
//        System.out.println("tifm kieesm theo ten: ");
//        int dem =0;
//        for(Product p : products){
//            if(p ==  products.)
//            System.out.println(p.getName());
//        }
//        if(dem==0){
//            System.out.println("Khoong cos");
//        }
//    }
}
