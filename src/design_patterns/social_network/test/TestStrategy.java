package design_patterns.social_network.test;

import design_patterns.social_network.EducationSystemController;
import design_patterns.social_network.facebook.FacebookApi;
import design_patterns.social_network.vk.PowerPoint;
import design_patterns.social_network.vk.VkApi;
import design_patterns.social_network.vk.VkServer;

/**
 * Created by macaque on 08.07.2016.
 */
public class TestStrategy {

    public static void main(String[] args) {
        EducationSystemController systemController = new EducationSystemController();
        //VkApi socialNetworkApi = new VkApi(new VkServer(new PowerPoint(220,"USA"),"i7",128,200));
    //    systemController.setSocialNetworkApi(systemController.getSocialNetworkApi());
        String res2 =  systemController.login("email", "1234");
        System.out.println(res2);
      //  FacebookApi facebookApi = new FacebookApi();
      //  systemController.setSocialNetworkApi(facebookApi);
        systemController.socialNetworkApi = new FacebookApi();
        String res1 =  systemController.login("email", "1234");
        System.out.println(res1);


    }
}
