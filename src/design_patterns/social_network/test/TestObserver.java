package design_patterns.social_network.test;

import design_patterns.social_network.EducationSystemController;
import design_patterns.social_network.subscriber.Gumanitariy;
import design_patterns.social_network.subscriber.ItStudentSubscriber;

/**
 * Created by macaque on 08.07.2016.
 */
public class TestObserver {

    public static void main(String[] args) {
        EducationSystemController controller = new EducationSystemController();
        controller.subscribe(new ItStudentSubscriber());
        controller.subscribe(new Gumanitariy());

        controller.notifyAll("New course. Auto QA");
    }

}
