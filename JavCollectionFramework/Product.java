package JavCollectionFramework;

import java.util.Scanner;

public class Product {
    private String nameProduct;
    private int gia;
    private double ID;

    //hàm ko có tham số
    public Product() {
    }

    // hàm có thám số
    public Product(String nameProduct, int gia, double ID) {
        this.nameProduct = nameProduct;
        this.gia = gia;
        this.ID = ID;
    }

    //get va set của thuộc tính
    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = this.nameProduct;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public double getID() {
        return ID;
    }

    public void setID(double ID) {
        this.ID = ID;
    }

    // thêm phương thức nhập product vào danh sách
    public void input(){
        Scanner prompt =new Scanner(System.in);
        System.out.println("Nhập ID sản phẩm");
        double ID= prompt.nextDouble();
        prompt.nextInt();
        this.setID(ID);

        System.out.println("Nhập tên sản phẩm");
        String nameProduct= prompt.nextLine();
        this.setNameProduct(nameProduct);

        System.out.println("Nhập Giá Sản Phẩm");
        int priceProduct= prompt.nextInt();
        prompt.nextInt();
        this.setGia(priceProduct);

    }

    //Hiển thị Danh sách sản phẩm
    public void output(){
        System.out.println("ID: "+this.getID()
                +"\n"+"Tên: "+this.getNameProduct()
                +"\n"+"Giá: "+this.getGia());
    }
    
}
