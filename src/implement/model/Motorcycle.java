package implement.model;

/**
 * Created by macaque on 01.07.2016.
 */
public class Motorcycle {

    private String type;
    private String color;
    private boolean stateFixed;


    public Motorcycle(String type, String color, boolean stateFixed) {
        this.type = type;
        this.color = color;
        this.stateFixed = stateFixed;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean getStateFixed() {
        return stateFixed;
    }

    public void setStateFixed(boolean stateFixed) {
        this.stateFixed = stateFixed;
    }
}
