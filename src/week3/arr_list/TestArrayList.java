package week3.arr_list;

import week3.fin.IPhone;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 * Created by macaque on 07.07.2016.
 */
public class TestArrayList {

    public static void main(String[] args) {
        List al = new ArrayList<>();

        al.add("Ivan");
        al.add(45);
        al.add(4535.33);

        al.set(1,48);
        Object removed = al.remove(1);

        al.add(0, new IPhone());

       Object obj =  al.get(2);

        al.size();

        List list = al.subList(1,2);

        Object[] mas = list.toArray();

        for (int i = 0; i <list.size() ; i++) {
            Object el = al.get(i);
        }

        //for each
        for(Object curr: al){
            System.out.println(curr);
        }

        int[] nums = {1,2,3,4,5,6};

        // must be overriden equals
        boolean containsRes = al.contains(new IPhone());
        int index = al.indexOf(new IPhone());
        Object removedIPhone = al.remove(new IPhone());

        al.clear();

        boolean emptyRes = al.isEmpty();

        Object o = 78;

        List<String> names = new ArrayList<>();
        names.add("Yura");
        String name = names.get(0);

        Object[] arr1 = names.toArray();
        String[] arr2 = names.toArray(new String[names.size()]);

        List<Integer> list1 = Arrays.asList(1,2,3);
        List<String> list2 = Arrays.asList("1","2","3");


    }
}
