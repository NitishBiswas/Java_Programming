
package datetime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateTime {

    public static void main(String[] args) {
        Date date = new Date();
        DateFormat dateFormate = new SimpleDateFormat("dd/MM/YYYY");
        String currentDate = dateFormate.format(date);
        System.out.println("Date : "+currentDate);
        
        LocalTime time = LocalTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh : mm : ss");
        String currentTime = time.format(formatter);
        System.out.println("Time : "+currentTime);
    }
    
}
