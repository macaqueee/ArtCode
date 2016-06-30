package Inherit.model;

/**
 * Created by macaque on 30.06.2016.
 */
public class Coder extends Worker {

    public Coder() {
        System.out.println("Conder constructor");
    }

    public Coder(int id, String name, double salary,
                 String phone, String programmingLanguage){

    }

    public String programmingLanguage;

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    public void code(){
        System.out.println("coder code");
    }
}
