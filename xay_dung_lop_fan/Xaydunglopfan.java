package xay_dung_lop_fan;

public class Xaydunglopfan {
    final int Slow=1;
    final int Medium=2;
    final int Fast=3;
    private int speed;
    private boolean on;
    private double radius;
    private String color;
    // Lớp giá trị mặc định
    public Xaydunglopfan(){
        this.speed = Slow;
        this.on = false;
        this.radius = 5;
        this.color = "blue";
    }
    //Lớp lấy giá trị
    public Xaydunglopfan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    //set và get của speed
    public int getSlow(){
        return Slow;
    }
    public int getMedium(){
        return Medium;
    }
    public int getFast(){
        return Fast;
    }
    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed){
        this.speed =speed;
    }

    //set và get của công tắc
    public boolean isOn(){
        return on;
    }
    public void setOn(boolean on){
        this.on=on;
    }

    //set và get của radius
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius=radius;
    }

    //set vaf get của màu Fan
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color=color;
    }

    //Hàm so sánh on == true hay false bằng toán tử ba ngôi
    @Override
    public String toString() {
       return this.on ?
               "Fan is on " + "speed=" + getSpeed() + ", radius=" + getRadius() + ", color=" + getColor() :
               "Fan is of " + "radius=" + getRadius() + ", color=" + getColor() ;
    }
}

   // Class để test
   class test{
    public static void main(String[] args) {
        Xaydunglopfan fan1 = new Xaydunglopfan(3, true, 10, "yellow");
        Xaydunglopfan fan2 = new Xaydunglopfan(2, false, 10, "Blue");
        System.out.println(fan1);
        System.out.println(fan2);
    }
}
