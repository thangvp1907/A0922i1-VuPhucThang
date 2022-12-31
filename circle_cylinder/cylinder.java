package circle_cylinder;

public class cylinder extends circle{
    public double height;
//hamf ko có tham số
    public cylinder() {

    }
    //set và get cuủa height
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    //kế thừa lớp cha của circle
    public cylinder(double radius, String color,double height) {
        super(radius, color);
        this.height=height;
    }
    public double getAreaHinhTru(){
        return super.getArea() * height;
    }

    @Override
    public String toString() {
        return super.toString() + " Height: "+getHeight();
    }
}
//class test2 {
//    public static void main(String[] args) {
//        cylinder hinhtru = new cylinder(5,"red",3);
//        circle hinhtron =new circle(2,"yellow");
//        System.out.println("Thuộc tính hình trụ= "+hinhtru);
//        System.out.println("Thuộc tính hình tròn= "+hinhtron);
//        System.out.println("Diện tích hình trụ= "+hinhtru.getareaHinhTru());
//        System.out.println("Diện tích hình tròn=  "+hinhtron.getArea());
//    }
//}
