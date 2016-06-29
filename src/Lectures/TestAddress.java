package Lectures;

/**
 * Created by macaque on 29.06.2016.
 */
public class TestAddress {
    public static void main(String[] args) {
        Address address = new Address("Fastiv","International",4);
        String gavno = address.getCity();
        System.out.println(address.printAddress());
        System.out.println(gavno);

       Student student = new Student();

    //    System.out.println(student.learnStudent());

    }
}
