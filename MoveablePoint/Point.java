package MoveablePoint;

public class Point {
    public float x=0.0f;
    public float y=0.0f;

    //hafm ko cos tham so
    public Point() {
    }

    //hafm co tham so
    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }
    //set vaf get cua x
    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }
    //set va get cua y
    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    //set va get cua XY
    public void setXY(float x,float y){
        this.x=x;
        this.y=y;

    }
    public float[] getXY(float x,float y){
        float arr[]= new float[2];
        arr[0]=this.x;
        arr[1]=this.y;
        return arr;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
