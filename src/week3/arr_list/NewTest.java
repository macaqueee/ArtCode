package week3.arr_list;

/**
 * Created by macaque on 07.07.2016.
 */
public class NewTest {

    public static void main(String[] args) {
        String a = "abc";
        String b = "abc";

        if (a.equals(b)){
            System.out.println("true");
        } else System.out.println("false");
        Element1 element1 = new Element1("arbuz", 2);
        Element1 element2 = new Element1("arbuz", 2);

        if (element1.equals(element2)){
            System.out.println("true");
        } else System.out.println("false");
    }
}
