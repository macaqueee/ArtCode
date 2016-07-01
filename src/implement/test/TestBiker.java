package implement.test;

import implement.generator.Generator;
import implement.model.Biker;

/**
 * Created by macaque on 01.07.2016.
 */
public class TestBiker {

    public int size;

    public static void main(String[] args) {

        Biker biker = new Biker(Generator.nameBikerGenerator(), Generator.ageBikerGenerator());
        System.out.println(biker.getName()+ " " + biker.getAge());
        TestBiker test = new TestBiker();
        System.out.println(test.check1());
    }

    public boolean check1(){
        if (TestBiker.check2(size)){
            System.out.println("true");
            return true;
        }
        return false;
    }

    public static boolean check2(int size){
        if (size == 0){
            System.out.println("check1 is true");
            return false;
        }
        return true;
    }
}
