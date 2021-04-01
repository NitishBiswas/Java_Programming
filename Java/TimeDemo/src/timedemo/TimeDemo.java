
package timedemo;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TimeDemo {

    public static void main(String[] args) {
        LocalTime Time = LocalTime.now();
        System.out.println(Time);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh : mm : ss");
        String currentTime = Time.format(formatter);
        System.out.println("Time : "+currentTime);
    }
    
}
