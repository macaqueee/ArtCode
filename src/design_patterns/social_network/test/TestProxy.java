package design_patterns.social_network.test;
import design_patterns.social_network.EducationSystemController;
import design_patterns.social_network.exception.InvalidLoginException;
import design_patterns.social_network.exception.MyApplicationException;

/**
 * Created by macaque on 08.07.2016.
 */
public class TestProxy {
    public static void main(String[] args) throws InvalidLoginException, MyApplicationException {
        EducationSystemController systemController = new EducationSystemController();
        String res = systemController.login("presly808","12345");

        System.out.println(res);
    }
}
