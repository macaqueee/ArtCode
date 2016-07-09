package week3.stat;

/**
 * Created by macaque on 06.07.2016.
 */
public class StatContainer {

    private int val;

    static {
        System.out.println("Before");
    }

    public  static int count = 10;

    static  {
        // while loading class
        int res = 234*12-234;
        count = res;
        System.out.println("static block");
    }

    public static int random(){
        return (int)(Math.random()*100);
    }

    public int testNonStatic(){
        return val + count;

    }
}
