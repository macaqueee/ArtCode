package week5.search;

/**
 * Created by macaque on 18.07.2016.
 */
public class LinearSearch {

    public static int indexOf(int[] mas, int key){
        for (int i = 0; i <mas.length ; i++) {
            if (mas[i] == key){
                return i;
            }
        }
        return -1;
    }
}
