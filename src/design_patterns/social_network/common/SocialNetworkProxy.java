package design_patterns.social_network.common;

import design_patterns.social_network.exception.SocialNetworkException;

/**
 * Created by macaque on 08.07.2016.
 */
public class SocialNetworkProxy implements SocialNetworkApi {

    private SocialNetworkApi target;

    public SocialNetworkProxy(SocialNetworkApi target) {
        this.target = target;
    }

    @Override
    public String login(String email, String pass) throws SocialNetworkException {
        //validation
        //process
        System.out.printf("email %s, pass %s \n", email, pass);
        return target.login(email,pass);
    }

    @Override
    public int createGroup(String name) {
        return 0;
    }
}
