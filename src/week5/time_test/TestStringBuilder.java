package week5.time_test;

import week5.utils.time.ITimeAction;
import week5.utils.time.TimeCounter;

import java.sql.Time;

/**
 * Created by macaque on 19.07.2016.
 */
public class TestStringBuilder {

    public static void main(String[] args) {

        final int count = 10_000;

        long strBuilderConc = TimeCounter.count(new ITimeAction() {
            @Override
            public void doAction() {
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < count; i++) {
                    sb.append(i);
                }
            }
        });

        System.out.println("String builder time " + strBuilderConc);


        long strConc = TimeCounter.count(new ITimeAction() {
            @Override
            public void doAction() {
                String str = "";
                for (int i = 0; i < count; i++) {
                    str = str+i;
                }
            }
        });

        System.out.println("String concat time " + strConc);

    }
}
