package design_patterns.social_network;

import design_patterns.social_network.common.SocialNetworkApi;
import design_patterns.social_network.common.SocialNetworkProxy;
import design_patterns.social_network.vk.*;
import design_patterns.social_network.vk.VkApi;

/**
 * Created by macaque on 08.07.2016.
 */
public class SocialNetworkApiFactory {

    public static SocialNetworkApi create(){
        return new SocialNetworkProxy(new VkApi(new VkServer(new PowerPoint(220,"USA"),"i7",128,200)));
    }
}
