package point2D_point3D;

import java.awt.geom.Point2D;
import java.sql.Array;

public class point2D {
    public float x =0.0f;
    public float y =0.0f;
    //hàm ko có tham số
    public point2D(){

    }
    //hàm có tham số
    public point2D(float x, float y){
        this.x=x;
        this.y=y;
    }

    //get và set của x
    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    // get và set của y
    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    //hàm get và set của XY
    public  void setXY (float x,float y){
        this.x=x;
        this.y=y;
    }
    public float[] getXY(float x,float y) {
        float ArrayXY[]= new float[2];
        ArrayXY[0]=this.x;
        ArrayXY[1]=this.y;
        return ArrayXY;
    }

    @Override
    public String toString() {
        return "point2D{" +
                "x=" + this.x +
                ", y=" + this.y +
                '}';
    }
}
