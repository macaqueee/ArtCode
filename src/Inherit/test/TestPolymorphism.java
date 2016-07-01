package Inherit.test;

import Inherit.controller.CompanyController;
import Inherit.model.Director;

/**
 * Created by macaque on 01.07.2016.
 */
public class TestPolymorphism {

    public static void main(String[] args) {
        Director director = new Director();
        CompanyController.startWork(director);
    }
}
