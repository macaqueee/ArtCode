package Lectures;

/**
 * Created by macaque on 29.06.2016.
 */
public class Subject {

    public String name;
    public int courseHour;
    public int doneHour;
    public int mark;


    public void setDoneHour(int doneHour) {
        this.doneHour = doneHour;
    }

    public String showDetailSubject() {
        return name + ": " + "hours=" + courseHour + " done_hours=" + doneHour + "\n";
    }

    public void initSubject(String initName, int initCourseHour) {

        name = initName;
        courseHour = initCourseHour;
    }

    public int calculateMark() {

        if ((float) doneHour / courseHour >= 0.9) {
            mark = 5;
        } else if ((float) doneHour / courseHour >= 0.7) {
            mark = 4;
        } else if ((float) doneHour / courseHour >= 0.5) {
            mark = 3;
        } else if ((float) doneHour / courseHour >= 0.3) {
            mark = 2;
        } else mark = 1;
        return mark;
    }
}
