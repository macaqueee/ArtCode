package Lectures;

import com.sun.javaws.Main;

/**
 * Created by macaque on 29.06.2016.
 */
public class Subject {

    public String name;
    public int course_hour;
    public int done_hour;
    public int mark;

    public void setDone_hour(int done_hour) {
        this.done_hour = done_hour;
    }

    public int calculateMark(){
        if (done_hour <= 50 && done_hour >= 45){
            return 5;
        } else if (done_hour < 45 && done_hour >= 35){
            return 4;
        } else if (done_hour < 35 && done_hour >= 25){
            return 3;
        } else if (done_hour < 25 && done_hour >= 15){
            return 2;
        } else return 0;
    }
    Student[] students = new Student[10];




}
