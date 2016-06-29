package Lectures;

/**
 * Created by macaque on 29.06.2016.
 */
public class Student {

    public String name;
    public Address address;
    private int sub_count;
    private Subject[] subject_list = new Subject[10];


    public void initStudent(String input_name, Address input_address){

        name = input_name;
        address = input_address;
    }

    public void learnStudent() {
        int hours;
        for (int i = 0; i <sub_count ; i++) {
            hours = subject_list[i].course_hour;
            subject_list[i].setDone_hour((int) (Math.random() * hours));
        }
    }

    public void addSubject(Subject subject) {
        subject_list[sub_count] = subject;
        sub_count++;
    }

    public void deleleteLastSubject() {
        sub_count--;
        subject_list[sub_count] = null;

    }

    public String showAllSubject() {
        String result = "";
        for (int i = 0; i < sub_count; i++) {
            result += subject_list[i].name + "\n";
        }
        return result;
    }

    public String showAllSubjectDetails(){
        String result = "";
        for (int i = 0; i <sub_count ; i++) {
            result += subject_list[i].showDetailSubject();
        }
        return result;
    }
    public float getAvgMark() {
        int sum_mark = 0;
        for (int i = 0; i < sub_count; i++) {
            sum_mark += subject_list[i].calculateMark();
        }
        return (float)sum_mark/sub_count;
    }
}
