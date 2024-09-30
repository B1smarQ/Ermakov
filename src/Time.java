import java.util.Arrays;

public class Time {
    private int sec,min,hrs;

    public Time(int sec, int min, int hrs) {
        this.sec = sec;
        this.min = min;
        this.hrs = hrs;
    }

    public Time(int sec, int min) {
        this.sec = sec;
        this.min = min;
    }

    public Time(int sec) {
        this.sec = sec;
    }

    private int[] calculateTime(){
        int tmp = 0;
        if(this.hrs != 0){
            tmp+=hrs*3600;

        }
        if(this.min!=0){
            tmp+=min*60;
        }
        if(this.sec!=0){
            tmp+=sec;
        }

        int tmpSec = 0,tmpMin = 0,tmpHrs = 0;

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
