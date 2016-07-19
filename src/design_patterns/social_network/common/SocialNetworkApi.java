package design_patterns.social_network.common;

import design_patterns.social_network.exception.SocialNetworkException;

/**
 * Created by macaque on 08.07.2016.
 */
public interface SocialNetworkApi {
    public String login (String email, String pass) throws SocialNetworkException;

    int createGroup(String name);

}
