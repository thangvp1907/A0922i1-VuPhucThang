package stop_watch;

public class Stopwatch {
   private long  starTime ;
   private long endTime;
//Hàm get và set của startTime
   public long getStarTime() {
       return starTime;
   }
    public void setStarTime( long starTime){
        this.starTime=starTime;
    }
    //Hàm get và set của endTime
    public long getEndTime(){
        return endTime;
    }
   public void setEndTime(long endTime){
       this.endTime=endTime;
   }

   //hàm lấy giá trị time của hệ thống
   void Stopwatch1(){
       this.starTime=System.currentTimeMillis();
   }


   //hàm bắt dầu
   void start(){
       long a =System.currentTimeMillis();
       this.setStarTime(a);
    }


    //hàm kết thúc
    void end(){
       long b=System.currentTimeMillis();
       this.setEndTime(b);
    }


    //hàm trả về
    long getElapsedTime(){
       long trave=this.getStarTime()-this.getEndTime();
       return trave;
    }


    //hàm test
    public static void main(String[] args) {
        Stopwatch ojb = new Stopwatch();
        ojb.start();
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        ojb.end();
        System.out.println("The Elapsed time is: " + ojb.getElapsedTime() + " milisec");
    }
}
