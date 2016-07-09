package week3.stat;

import jdk.internal.dynalink.beans.StaticClass;

/**
 * Created by macaque on 06.07.2016.
 */
public class TestStatic {

    public static void main(String[] args) {
        String res = "233242";

        StatContainer container = new StatContainer();
        int ran2 =  StatContainer.count;
        int ran1 = StatContainer.random();

    }
}
