package accent_modifier;

public class Accient_modifier {
    private double radius=1.0;
    private String color ="Red";

    //hàm ko có tham số
    Accient_modifier(){

    }

    // hàm có tham số mặc định
    Accient_modifier(double radius){
        this.radius = radius;
    }


    //get và set radius
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius=radius;
    }

    // get và set color
    public String getColor(){
        return color;
    }
    public void setColor(){
        this.color=color;
    }


    //get của Area
    public double getArea(){
        return radius*radius*Math.PI;
    }
}
class TestCircle {
    public static void main(String[] args) {
        Accient_modifier a = new Accient_modifier(2);
        System.out.println(a.getArea());
    }
}
