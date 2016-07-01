package implement.model;

import implement.model.Motorcycle;

/**
 * Created by macaque on 01.07.2016.
 */
public class Biker {

    private String name;
    private int age;

    Motorcycle motorcycle;

    public Biker(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void buyMotorcycle(){

    }

    public void sellMotorcycle(){

    }

    public void fixMotorcycle(){

    }
}
