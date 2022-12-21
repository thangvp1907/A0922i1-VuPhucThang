package xay_dung_lop_chi_ghi_java;

public class Xaydunglopchighitrongjava {
    private String name = "jhon";
    private String className = "A09";

    //hàm ko có tham số
    Xaydunglopchighitrongjava(){

    }
    //hàm có tham số
    Xaydunglopchighitrongjava(String name,String className){
        this.name=name;
        this.className= className;
    }
        //tạo get và set cho name
        public String getName () {
            return name;
        }
        public void setName (String name){
            this.name = name;
        }

        //tạo set và get cho className
        public String getClassName () {
            return className;
        }
        public void setClassName (String className){
            this.className = className;
        }
}
class test{
    public static void main(String[] args) {
        Xaydunglopchighitrongjava student =new Xaydunglopchighitrongjava();
        student.setName("Quang");
        student.setClassName("A10");
        System.out.println("tên:"+student.getName()+" "+"Lớp:"+student.getClassName());
    }
}
