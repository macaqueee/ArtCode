package week4.exceptions;

import design_patterns.social_network.Course;
import design_patterns.social_network.EducationSystemController;
import design_patterns.social_network.exception.InvalidLoginException;
import design_patterns.social_network.exception.MyApplicationException;

/**
 * Created by macaque on 14.07.2016.
 */
public class Intro {

    public static void main(String[] args) {
        EducationSystemController systemController = new EducationSystemController();
        String res = null;
            try {
                res = systemController.login("asddas","dsad");
            } catch (InvalidLoginException e) {
                e.printStackTrace();
            } catch (MyApplicationException e) {
                e.printStackTrace();
            }


        Course found = systemController.getCourse(-1);
        System.out.println(found);

        int i = systemController.createCourse(new Course());
        System.out.println(i);

        systemController.getSocialNetworkApi();


    }
}
