package Inherit.test;

import Inherit.model.Director;
import Inherit.model.Manager;

/**
 * Created by macaque on 01.07.2016.
 */
public class TestAggregationComposition {

    public static void main(String[] args) {

        //aggregation
        Manager manager = new Manager();
        Director director = new Director();
        director.setRightHand(manager);

        director = null;

        // composition

        Director director1 = new Director();
        director1.setRightHand(new Manager());

        director1 = null;

    }
}
