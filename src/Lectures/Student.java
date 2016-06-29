package Lectures;

/**
 * Created by macaque on 29.06.2016.
 */
public class Student {
    public String name;
    public Address address;
    public int sub_count;
    Subject[] subject_list = new Subject[10];


    private void learnStudent(Subject subject){
        int hours_count = 50;  // making learning hours 0..50 range
        subject.setDone_hour((int)(Math.random()*hours_count));
    }

    public void addSubject(Subject subject){
        subject_list[sub_count] = subject;
        sub_count++;
    }

    public void deleleteLastSubject(){
        sub_count--;
        subject_list[sub_count] = null;

    }

    public String showAllSubject(){
        String result = "";
        for (int i = 0; i < sub_count; i++) {
            result += subject_list[i].name + "\n";
        }
        return result;
    }

    public int getAvgMark(int hours_count){
        return 0;
    }
}
