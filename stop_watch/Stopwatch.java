package stop_watch;

public class Stopwatch {
   private long  starTime ;
   private long endTime;

   public long getStarTime() {
       return starTime;
   }
    public long getEndTime(){
        return endTime;
    }
   public void setStarTime( long starTime){
       this.starTime=starTime;
   }
   public void setEndTime(long endTime){
       this.endTime=endTime;
   }

   void Stopwatch1(){
       this.starTime=System.currentTimeMillis();
   }
   void start(){
       long a =System.currentTimeMillis();
       this.setStarTime(a);
    }
    void end(){
       long b=System.currentTimeMillis();
       this.setEndTime(b);
    }
    long getElapsedTime(){
       long trave=this.getStarTime()-this.getEndTime();
       return trave;
    }
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
