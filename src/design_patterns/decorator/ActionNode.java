package design_patterns.decorator;

/**
 * Created by macaque on 15.07.2016.
 */
public class ActionNode {

    private String value;

    private ActionNode next;

    public ActionNode(String value, ActionNode next) {
        this.value = value;
        this.next = next;
    }

    public String action(){
        return next != null ? next.action() + value : value;
    }
}
