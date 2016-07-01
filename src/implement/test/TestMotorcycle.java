package implement.test;

import implement.generator.Generator;
import implement.model.Motorcycle;

/**
 * Created by macaque on 01.07.2016.
 */
public class TestMotorcycle {

    public static void main(String[] args) {

        Motorcycle motorcycle = new Motorcycle(Generator.typeMotorcycleGenerator(), Generator.colorMotorcycleGenerator(),
                                            Generator.stateFixedGenerator());

        System.out.println(motorcycle.getType() + " " + motorcycle.getColor() + " " + motorcycle.getStateFixed() );
    }
}


