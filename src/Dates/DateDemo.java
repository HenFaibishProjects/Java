package src.Dates;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
 
public class DateDemo {
 
//SimpleDateFormat
   public static void main(String args[]) throws ParseException {
          String dt = "2015-09-30";  // Start date
          SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
          Calendar c = Calendar.getInstance();
          c.setTime(sdf.parse(dt));
          c.add(Calendar.DATE, 144);  // number of days to add
          dt = sdf.format(c.getTime());  // dt is now the new date
          System.out.println(dt);
   }
  
          
}
 
