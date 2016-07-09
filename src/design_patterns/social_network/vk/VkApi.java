package design_patterns.social_network.vk;

import design_patterns.social_network.common.SocialNetworkApi;
import design_patterns.social_network.facebook.FacebookGroup;

/**
 * Created by macaque on 08.07.2016.
 */
public class VkApi implements SocialNetworkApi{

    public VkApi(VkServer vkServer) {
        this.vkServer = vkServer;
    }

    private VkServer vkServer;

    @Override
    public String login (String email, String pass){
        return "Vk key";
    }

    @Override
    public int createGroup(String name){
        System.out.println("Vk group " + name);
        return 1;
    }

    public VkGroup get(int id){
        return new VkGroup();
    }
}
