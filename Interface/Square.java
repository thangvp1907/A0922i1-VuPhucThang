package Interface;

public class Square extends Shape implements Colorable {
    public double edge;
//hàm ko có tham số
    public  Square(){

    }
    //hàm có tham số và kế thừa lớp Shape
    public Square(String color,boolean filled, double edge) {
        super(color, filled);
        this.edge = edge;
    }
    //hàm get và set của Square
    public double getEdge() {
        return edge;
    }

    public void setEdge(double edge) {
        this.edge = edge;
    }

    //hàm tính diện tich
    public double getArea(){
        return edge*edge;
    }
    //hàm chu vi
    public double getPerimeter(){
        return edge*4;
    }

    @Override
    public String toString() {
        return "Square{" + "edge=" + edge +"Area="+getArea()+"Chu vi="+getPerimeter()+'}';
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides..");
    }
}
