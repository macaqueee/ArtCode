package design_patterns.social_network.common;

/**
 * Created by macaque on 08.07.2016.
 */
public interface SocialNetworkApi {
    public String login (String email, String pass);

    int createGroup(String name);
}
