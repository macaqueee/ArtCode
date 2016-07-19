package week5.time_test;

import week5.sort.SortUtils;
import week5.utils.time.ITimeAction;
import week5.utils.time.TimeCounter;

import java.util.Arrays;

/**
 * Created by macaque on 19.07.2016.
 */
public class TestSorting {

    public static void main(String[] args) {

        int[] mas = new int[100_000];

        // java 8
        int[] copy1 = Arrays.stream(mas).map((e) -> (int)(Math.random()*1000)).toArray();
        int[] copy2 = Arrays.copyOf(copy1, copy1.length);
        System.out.println("start bubble sort");
        /*for (int i = 0; i <mas.length ; i++) {
            mas[i] =  (int)(Math.random()*1000);
        }*/

        long res = TimeCounter.count(new BubbleSortTimeAction(mas));
        System.out.println("bubble sort time " + res);

        // local anonym class
        ITimeAction innerSortJava = new ITimeAction() {
            @Override
            public void doAction() {
                Arrays.sort(mas);

            }
        };

        long arraysSortRes = TimeCounter.count(innerSortJava);
        System.out.println("arrays sort time " + arraysSortRes);
    }
}

class BubbleSortTimeAction implements ITimeAction{

    private int[] mas;

    public BubbleSortTimeAction(int[] mas) {
        this.mas = mas;
    }

    @Override
    public void doAction() {
        SortUtils.selectionSort(mas);
    }
}
