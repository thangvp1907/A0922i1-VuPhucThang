package JavCollectionFramework;

import java.util.ArrayList;
import java.util.Scanner;

public class Productmanager implements producrmanager {
    ArrayList<Product> productList =new ArrayList<>();
    @Override
    public void addNew() {
        Product product = new Product();
        product.input();
        productList.add(product);
    }

    @Override
    public void display() {
        for (Product e : productList){
            e.output();
        }
    }

    @Override
    public void edit() {
        Scanner prompt = new Scanner(System.in);
        System.out.println("Nhập ID sản phẩm muốn sửa");
        int dem=0;
        double ID =prompt.nextDouble();
        prompt.nextInt();
        for(Product e : productList){
            if(ID != e.getID()){
                System.out.println("Không có id ");
            }else {
                System.out.println("Lựa chọn để sửa");
                int choice;
                Scanner prompt2 =new Scanner(System.in);
                do{
                    System.out.println("1.Sửa Tên sản phẩm");
                    System.out.println("2.Sửa Giá sản phẩm");
                    System.out.println("3.Thoát");
                    choice =prompt2.nextInt();
                    switch (choice){
                        case 1:
                            System.out.println("Tên muốn sửa: ");
                            String editName=prompt2.nextLine();
                            e.setNameProduct(editName);
                            break;
                        case 2:
                            System.out.println("Giá muốn sửa");
                            int editGia=prompt2.nextInt();
                            prompt2.nextInt();
                            e.setGia(editGia);
                            break;
                        case 3:
                            break;
                    }
                }while (choice ==0);
            }
        }
    }

    @Override
    public void delete() {

    }

    @Override
    public void search() {

    }

    @Override
    public void sapxep() {

    }
}
