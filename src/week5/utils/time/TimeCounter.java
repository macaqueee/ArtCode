package week5.utils.time;

/**
 * Created by macaque on 19.07.2016.
 */
public class TimeCounter {

    public static long count(ITimeAction action){

        long start = System.currentTimeMillis();
        action.doAction();
        long end = System.currentTimeMillis();

        return end - start;
    }
}
