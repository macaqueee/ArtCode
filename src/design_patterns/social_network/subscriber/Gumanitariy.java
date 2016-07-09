package design_patterns.social_network.subscriber;

import week3.fin.IShop;

/**
 * Created by macaque on 08.07.2016.
 */
public class Gumanitariy implements ISubscriber {
    @Override
    public void notify(String message) {
        System.out.println(message + "mark as spam");
    }
}
