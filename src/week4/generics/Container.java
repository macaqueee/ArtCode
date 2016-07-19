package week4.generics;

/**
 * Created by macaque on 15.07.2016.
 */
public class Container<T> {

    private T el;

    public Container(){

    }

    public Container(T el) {
        this.el = el;
    }

    public T getEl() {
        return el;
    }

    public void setEl(T el) {
        this.el = el;
    }
}
