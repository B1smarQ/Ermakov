import java.util.Arrays;

public class Time {
    private int sec,min,hrs,totalSec = 0;

    public Time(int sec, int min, int hrs) {
        this.sec = sec;
        this.min = min;
        this.hrs = hrs;
        totalSec += sec + min*60 + hrs*3600;
        if(totalSec > 3600*24) throw new Stone("time can't be more than 24 hrs");
    }

    public Time(int sec, int min) {
        this(sec,min,0);
    }

    public Time(int sec) {
        this(sec,0);
    }

    private int[] calculateTime(){

        int tmpSec = 0,tmpMin = 0,tmpHrs = 0;
        int tmp = totalSec;
        tmpHrs+=tmp/3600;
        tmp-=tmpHrs*3600;

        tmpMin = tmp/60;
        tmp-=tmpMin*60;

        tmpSec = tmp;

        return new int[]{tmpHrs,tmpMin,tmpSec};
    }

    @Override
    public String toString() {
        int[] time = calculateTime();
        return Arrays.toString(time);
    }
}
