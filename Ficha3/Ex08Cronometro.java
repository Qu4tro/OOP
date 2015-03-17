import java.util.Scanner;
import java.util.Date;

class Duration {

    int minutes;
    int seconds;
    int miliseconds;
    long durationInMiliseconds;

    public Duration(long duration){

        durationInMiliseconds = duration;

        miliseconds = (int) duration % 1000;
        seconds = (int) duration / 1000;
        minutes = seconds / 60;
        seconds %= 60;
    }

    public long getTotalMilliseconds(){
        return durationInMiliseconds;
    }
    public int getMiliseconds(){
        return miliseconds; 
    }
    public int getMinutes(){
        return minutes; 
    }
    public int getSeconds(){
        return seconds;
    }
    public String toString(){
        return minutes + "M" + seconds + "." + miliseconds + "s";
    }

    public boolean equals(Object o) {
        if (this == o){
            return true;
        }
        if ((o == null) || (this.getClass() != o.getClass())){
            return false;	
        }
        Duration d = (Duration) o;
        
        return durationInMiliseconds == d.getTotalMilliseconds();
    }

    public int hashCode(){
        int hash = 7;
        hash = hash * 31 + Long.hashCode(this.durationInMiliseconds);
        return hash;
    }
    
    

}

class CronometroDS {

    long begin;
    long firstStop;
    long end;

    public CronometroDS(long begin, long firstStop, long end){
        this.begin = begin;
        this.firstStop = firstStop;
        this.end = end;
    }

    public Duration firstTime(){
        return new Duration(firstStop - begin);
    }
    public Duration secondTime(){
        return new Duration(end - firstStop);
    }
    public Duration totalTime(){
        return new Duration(end - begin);
    }

    public Date beginDate(){
        Date date = new Date();
        date.setTime(begin);
        return date;
    }

    public Date firstStopDate(){
        Date date = new Date();
        date.setTime(firstStop);
        return date;
    }

    public Date endDate(){
        Date date = new Date();
        date.setTime(end);
        return date;
    }

    public String toString(){
    
        String str = beginDate().toString();
        str += "--- (";
        str += firstTime().getSeconds();
        str += "s) ---> ";

        str += firstStopDate().toString();
        str += "--- (";
        str += secondTime().getSeconds();
        str += "s) ---> ";

        str += endDate().toString();
    
        return str;
    }
}

public class Ex08Cronometro {

    public static void main(String[] args) {
        System.out.println(timeit());
        // TODO: Testing
    }
    
    public static CronometroDS timeit(){

        long begin;
        long firstStop;
        long end;

        Scanner sc = new Scanner(System.in);
        begin = System.currentTimeMillis();
        sc.nextLine();
        firstStop = System.currentTimeMillis();
        sc.nextLine();
        end = System.currentTimeMillis();

        return new CronometroDS(begin, firstStop, end);
    }


   
}
