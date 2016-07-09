package week3.wrappers;

import java.util.Objects;

/**
 * Created by macaque on 07.07.2016.
 */
public class DataContainer {

    private Object val;

    public DataContainer(Object val) {
        this.val = val;
    }

    public Object getVal() {
        return val;
    }

    public void setVal(Object val) {
        this.val = val;
    }
}
