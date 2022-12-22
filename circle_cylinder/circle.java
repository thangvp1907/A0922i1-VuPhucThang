package circle_cylinder;

import java.awt.geom.Area;

public class circle {
    public double radius=2;
    public String color ="Blue";

    //hàm không tham số
    public circle(){

    }
    public circle(double radius,String color){
        this.radius=radius;
        this.color=color;
    }
    //get và set của radius
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    //set và get của color
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    //get của Area
    public double getArea(){
        return radius * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "Radius: "+getRadius()+" color: "+getColor();
    }
}
// class test {
//     public static void main(String[] args) {
//         circle hinhtron = new circle();
//         System.out.println(hinhtron);
//         System.out.println(hinhtron.getArea());
//     }
// }
