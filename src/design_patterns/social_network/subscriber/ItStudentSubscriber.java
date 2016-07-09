package design_patterns.social_network.subscriber;

/**
 * Created by macaque on 08.07.2016.
 */
public class ItStudentSubscriber implements ISubscriber  {

    @Override
    public void notify(String message) {
        System.out.println("I will read it (important)" + message);
    }
}
