package week4.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Created by macaque on 15.07.2016.
 */
public class Intro {

    public static void main(String[] args) {
        Container container = new Container();
        container.setEl(23);
        Double d = (Double) container.getEl();

        // since java 7
        Container<Integer> container1 = new Container<>();
        // before java 7
        //Container<Integer> container1 = new Container<Integer>();
        Byte b = 22;
        Integer g = 5;
        container1.setEl(g);
        Integer el = container1.getEl();

        Intro.<Integer,String>convert(23);
        convert(23);

        List<? extends Number> l = Arrays.asList(2,4,5,5);
        Object ob = l.get(0);

        compare("Ivan", 23);
        Comparator<String> comparator    = new MyStringComparator();
        compare2("Ivan", "str", comparator);

       // Intro.<String>iterateOver(Arrays.asList("23","23424"));
    }

    public static<T extends Comparable<T>> int compare(T o1, T o2){
        return o1.compareTo(o2);
    }

    public static<E> int compare2(E o1, E o2, Comparator<E> comparator){
        return comparator.compare(o1,o2);
    }

    public static void iterateOver(List<?> al){
        for (Object o : al) {
            System.out.println(o);
        }
    }

    public static<X,Z> Z convert (X x){
        return null;
    }

    public static class MyStringComparator implements Comparator<String>{


        @Override
        public int compare(String o1, String o2) {
            return o1.length() - o2.length();
        }
    }
}
