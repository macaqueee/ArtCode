package design_patterns.social_network;

import Lectures.Student;
import design_patterns.social_network.common.SocialNetworkApi;
import design_patterns.social_network.exception.InvalidLoginException;
import design_patterns.social_network.exception.MyApplicationException;
import design_patterns.social_network.exception.SocialNetworkException;
import design_patterns.social_network.subscriber.ISubscriber;

import javax.swing.plaf.ColorUIResource;
import javax.swing.tree.ExpandVetoException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by macaque on 08.07.2016.
 */
public class EducationSystemController {
    
    private List<ISubscriber> subscriberList = new ArrayList<>();

    public SocialNetworkApi socialNetworkApi = SocialNetworkApiFactory.create();

    //return course id
    public int createCourse(Course course){
        return socialNetworkApi.createGroup("name");

    }
    public String login(String email, String pass) throws InvalidLoginException , MyApplicationException{

        if (!email.contains("@")){
            throw new InvalidLoginException("invalid email");
        }
        try {
            String message = socialNetworkApi.login(email, pass);
            return message;
        } catch (SocialNetworkException e) {
            e.printStackTrace();
            throw new MyApplicationException("social network error");
        }

    }

    public Course getCourse(int id){
        return null;
    }

    public void subscribe(ISubscriber subscriber){
        subscriberList.add(subscriber);
    }

    public void notifyAll(String message){
        for (ISubscriber iSubscriber : subscriberList) {
            iSubscriber.notify(message);
        }
    }
    
    public SocialNetworkApi getSocialNetworkApi() {
        return socialNetworkApi;
    }

    public void setSocialNetworkApi(SocialNetworkApi socialNetworkApi) {
        this.socialNetworkApi = socialNetworkApi;
    }
}
