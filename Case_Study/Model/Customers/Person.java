package Case_Study.Model.Customers;

public abstract class Person {
    private int code;
    private String fullname;
    private int date;
    private String gender;
    private double numberid;
    private int numberphone;
    private String email;
    //hàm ko có tham số
    public Person(){

    }
    //hàm có tham số
    public Person(int code, String fullname, int date, String gender, double numberid, int numberphone, String email) {
        this.code = code;
        this.fullname = fullname;
        this.date = date;
        this.gender = gender;
        this.numberid = numberid;
        this.numberphone = numberphone;
        this.email = email;
    }
    //set và get các thuộc tính
    public int getCode() {
        return code;
    }
    public void setCode(int code) {
        this.code = code;
    }

    public String getFullname() {
        return fullname;
    }
    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public int getDate() {
        return date;
    }
    public void setDate(int date) {
        this.date = date;
    }

    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getNumberid() {
        return numberid;
    }
    public void setNumberid(double numberid) {
        this.numberid = numberid;
    }

    public int getNumberphone() {
        return numberphone;
    }
    public void setNumberphone(int numberphone) {
        this.numberphone = numberphone;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person{" +
                "code=" + code +
                ", fullname='" + fullname + '\'' +
                ", date=" + date +
                ", gender=" + gender +
                ", numberid=" + numberid +
                ", numberphone=" + numberphone +
                ", email='" + email + '\'' +
                '}';
    }
}
