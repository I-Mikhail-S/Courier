package org.example.time;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TimeBuilder {
    public static boolean isValidTime(String time)
    {

        // Regex to check valid time in 12-hour format.
        String regexPattern
                = "(1[012]|[1-9]):"
                + "[0-5][0-9](\\s)"
                + "?(?i)(am|pm)";

        // Compile the ReGex
        Pattern compiledPattern
                = Pattern.compile(regexPattern);

        // If the time is empty
        // return false
        if (time == null) {
            return false;
        }

        // Pattern class contains matcher() method
        // to find matching between given time
        // and regular expression.
        Matcher m = compiledPattern.matcher(time);

        // Return if the time
        // matched the ReGex
        return m.matches();
    }
    public static long getTime(String s1,String s2){

        return 0;
      //  return ChronoUnit.SECONDS.between(Calendar.se, LocalDateTime.parse(s2));
    }
}
