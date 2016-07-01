package implement.generator;

/**
 * Created by macaque on 01.07.2016.
 */
public class Generator {


    public static String nameBikerGenerator(){
        String[] name = {"Valera","Petro","Ignat", "Velentin", "Kolia", "Vasia", "Zhuzha"};
        return name[(int)(Math.random()*name.length)];
    }

    public static int ageBikerGenerator(){
        int age = 60;
        return (int)(Math.random()*age);
    }

    public static String typeMotorcycleGenerator(){
        String[] name = {"Yamaha", "Honda", "Suzuki", "Kawasaki"};
        return name[(int)(Math.random()*name.length)];
    }

    public static String colorMotorcycleGenerator(){
        String[] name = {"Red", "Black", "Yellow", "Green"};
        return name[(int)(Math.random()*name.length)];
    }

    public static boolean stateFixedGenerator(){
        return ((int)(Math.random()) == 0) ? false : true ;
    }

}
