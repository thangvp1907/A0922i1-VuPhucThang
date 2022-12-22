package circle_cylinder;

public class cylinder extends circle{
    public double height=2;
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
    public double areaHinhTru(){
        return super.getArea() * height;
    }

    @Override
    public String toString() {
        return super.toString() + " Height: "+getHeight();
    }
}
class test2 {
    public static void main(String[] args) {
        cylinder hinhtru = new cylinder();
        circle hinhtron =new circle();
        System.out.println(hinhtru);
        System.out.println(hinhtron);
        System.out.println(hinhtru.areaHinhTru());
        System.out.println(hinhtron.getArea());
    }
}
