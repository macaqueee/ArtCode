package design_patterns.social_network.test;

import design_patterns.social_network.EducationSystemController;
import design_patterns.social_network.twitter.TwitterApi;
import design_patterns.social_network.twitter.TwitterSocialNetworkAdapter;

/**
 * Created by macaque on 08.07.2016.
 */
public class TestAdapter {

    public static void main(String[] args) {
        EducationSystemController systemController = new EducationSystemController();

        systemController.setSocialNetworkApi(new TwitterSocialNetworkAdapter(new TwitterApi()));
    }
}
