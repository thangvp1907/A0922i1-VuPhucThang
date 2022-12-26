package MoveablePoint;

import java.lang.reflect.Array;

public class MoveablePoint extends Point{
    public float xSpeed=0.0f;
    public float ySpeed=0.0f;

    //hafm ko co tham so

    public MoveablePoint() {
    }
    //ham co tham so
    public MoveablePoint(float x,float y, float xSpeed,float ySpeed){
        super(x,y);
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }

    //set va get cua xSpeed
    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }
    //set va get cua ySpeed
    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    //set va get cua speed
    public void Speed(float xSpeed,float ySpeed){
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }
    public float[] getSpeed(){
        float Array[] = new float[2];
        Array[0]=this.xSpeed;
        Array[1]=this.ySpeed;
        return Array;
    }
    @Override
    public String toString() {
        return "MoveablePoint{" +
                "xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                ", x=" + x +
                ", y=" + y +
                '}';
    }

    //tinh speed cua x va y
    public MoveablePoint move(){
        x+=xSpeed;
        y+=ySpeed;
        return this;
    }
}
   class test {
    public static void main(String[] args) {
        Point point=new Point(10,20);
        MoveablePoint moveablePoint=new MoveablePoint(10,20,30,30);
        System.out.println(point);
        moveablePoint.move();
        System.out.println(moveablePoint);
    }
}
