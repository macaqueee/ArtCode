package Lectures;

import java.rmi.dgc.Lease;

/**
 * Created by macaque on 29.06.2016.
 */
public class TestStudent {

    public static void main(String[] args) {

        Student student = new Student();
        Address address = new Address("Fastiv","International",4);

        Subject math = new Subject();
        Subject chemistry = new Subject();
        Subject history = new Subject();

        math.initSubject("Math",50);
        chemistry.initSubject("Chemical",30);
        history.initSubject("History",20);
        student.initStudent("Oleksii", address);

        student.addSubject(math);
        student.addSubject(chemistry);
        student.addSubject(history);

        System.out.println(student.showAllSubject());

        student.learnStudent();

        System.out.println(student.showAllSubjectDetails());

        //System.out.println(student.getAvgMark());
        System.out.println("Math mark: " + math.calculateMark());
        System.out.println("Chemistry mark: " + chemistry.calculateMark());
        System.out.println("History mark: " + history.calculateMark());

        System.out.printf("Average Mark: " + "%.1f" + "\n", student.getAvgMark());

    }
}
