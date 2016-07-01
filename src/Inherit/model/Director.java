package Inherit.model;

/**
 * Created by macaque on 01.07.2016.
 */
public class Director extends Worker {

    private Manager rightHand;

    public Manager getRightHand() {
        return rightHand;
    }

    public void setRightHand(Manager rightHand) {
        this.rightHand = rightHand;
    }

    public void work(){
        System.out.println("Director work method");
    }

    @Override
    public Director getOwnSelf() {
        return this;
    }
}
