package point2D_point3D;

public class point3D extends point2D {
    public float z;

    //hàm ko có tham số
    point3D() {

    }

    //hàm có tham số
    public point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    //set và get của Z
    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    // hàm get và set của XYZ
    public void setXYZ(float x, float y, float z) {
        super.setXY(x, y);
        this.z = z;
    }

    public float[] getXYZ(float x, float y, float z) {
        float ArrayXYZ[] = new float[3];
        ArrayXYZ[0] = this.x;
        ArrayXYZ[1] = this.y;
        ArrayXYZ[2] = this.z;
        return ArrayXYZ;
    }

    @Override
    public String toString() {
        return "point3D{" +
                "z=" + z +
                ", x=" + x +
                ", y=" + y +
                '}';
    }

    public static void main(String[] args) {
        point3D p2= new point3D(2,7,10);
        System.out.println(p2.toString());
        point2D p = new point2D(2,7);
        System.out.println(p.toString());
    }
}