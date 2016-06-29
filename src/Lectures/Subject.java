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

    public String showDetailSubject(){
        return name + ": " + "hours=" +course_hour + " done_hours=" + done_hour  + "\n";
    }
    public void initSubject(String init_name, int init_course_hour){

        name = init_name;
        course_hour = init_course_hour;
    }

    public int calculateMark(){

        if ((float)done_hour/course_hour >= 0.9){
            mark = 5;
        } else if ((float)done_hour/course_hour >= 0.7){
            mark = 4;
        } else if ((float)done_hour/course_hour >= 0.5){
            mark = 3;
        } else if ((float)done_hour/course_hour >= 0.3){
            mark = 2;
        } else mark = 1;
        return mark;
    }
}
