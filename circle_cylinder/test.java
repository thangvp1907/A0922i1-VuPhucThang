package circle_cylinder;

public class test {
    public static void main(String[] args) {
        cylinder hinhtru = new cylinder(10,"red",3);
        circle hinhtron =new circle(2,"yellow");
        System.out.println("Thuộc tính hình trụ= "+hinhtru);
        System.out.println("Thuộc tính hình tròn= "+hinhtron);
        System.out.println("Diện tích hình trụ= "+hinhtru.getAreaHinhTru());
        System.out.println("Diện tích hình tròn=  "+hinhtron.getArea());
    }
}
