package Inherit.test;

import Inherit.model.Coder;
import Inherit.model.Worker;

/**
 * Created by macaque on 30.06.2016.
 */
public class TestInheritance {

    public static void main(String[] args) {
        Coder coder = new Coder();
        coder.getId();
        coder.code();

        Worker worker = new Worker();

        //Abstraction
        Worker some = new Coder();

        startWork(worker);
        startWork(coder);
        startWork(some);

    }

    public static void startWork(Worker worker){

    }
}
