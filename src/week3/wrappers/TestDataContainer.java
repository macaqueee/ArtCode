package week3.wrappers;

/**
 * Created by macaque on 07.07.2016.
 */
public class TestDataContainer {

    public static void main(String[] args) {

        DataContainer dataContainer = new DataContainer(3);

        Integer o = 23;
        Integer o1 = new Integer(23);

        int a = o1;

        Object obj = 23;

        int res = Integer.compare(22,22);

        int val = Integer.parseInt("22");
        Integer val2 = Integer.valueOf(22);
        Integer val3 = Integer.valueOf("22");

        long st1 = System.currentTimeMillis();
        Integer con = 0;

        for (int i = 0; i < 100_000; i++) {
            con = con + 1;
        }
        System.out.println(System.currentTimeMillis() - st1);

        long st2 = System.currentTimeMillis();
        int resCon = 0;
        for (int i = 0; i < 100_000; i++) {
            resCon = resCon + 1;
        }
        System.out.println(System.currentTimeMillis() - st2);
    }
}
