package week4.exceptions;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by macaque on 14.07.2016.
 */
public class IntroChecked {

    public static void main(String[] args) /*throws ParseException*/{
        System.currentTimeMillis();
        Date point = new Date();
        long millis = point.getTime();

        Date date = null;
        try {
            date =  myMethod("1990-06-13");
        } catch (ParseException e) {
            e.printStackTrace();
            System.out.println("You got default date");
            date = new Date();
        }
    }

    public static Date myMethod(String strDate) throws ParseException{

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-mm-dd");
        Date date = simpleDateFormat.parse(strDate);
        return date;
    }
}
