package design_patterns.social_network.twitter;

import design_patterns.social_network.common.SocialNetworkApi;

/**
 * Created by macaque on 08.07.2016.
 */
public class TwitterSocialNetworkAdapter implements SocialNetworkApi{

    private TwitterApi twitterApi;

    public TwitterSocialNetworkAdapter(TwitterApi twitterApi) {
        this.twitterApi = twitterApi;
    }

    @Override
    public String login(String email, String pass) {
        return null;
    }

    @Override
    public int createGroup(String name) {
        String postID = twitterApi.createPost(name);
        String intValue = postID.split("=")[1];

        return Integer.parseInt(intValue);
    }
}
