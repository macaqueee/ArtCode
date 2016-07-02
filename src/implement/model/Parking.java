package implement.model;

import implement.model.Motorcycle;


/**
 * Created by macaque on 01.07.2016.
 */
public class Parking {

    private int size;
    private Motorcycle[] motorcycles = new Motorcycle[10];
    private boolean stateParking;

    private void open(){
        stateParking = true;
    }

    private void close(){
        stateParking = false;
    }

    public boolean addMotOnLastFreePlace(Motorcycle motorcycle){
        if (Parking.checkStateParking(stateParking)) {
            if (Parking.checkFreePlace(size)) {
                for (int i = motorcycles.length; i > 0; i--) {
                    if (motorcycles[i] == null) {
                        addMoto(motorcycle, i);
                        return true;
                    }
                    break;
                }
            }
        }
        return false;
    }

    public boolean addMotoByPlaceNumber(Motorcycle motorcycle, int place){
        if (checkInputNumber(place)) {
            if (checkStateParking(stateParking)) {
                if (checkFreePlace(size)) {
                    if (motorcycles[place] != null) {
                        System.out.println("Sorry, but this place already taken by another moto");
                    } else {
                        addMoto(motorcycle, place);
                    }
                }
            }
        }
            return false;
    }

    public Motorcycle takeLastMoto(){
        if (size != 0) {
            return motorcycles[size];
        } else
        return null;
    }

    public Motorcycle takeMotoByPlaceNumber(int place){
        return null;
    }

    private boolean addMoto(Motorcycle motorcycle,int inputPlace){
        motorcycles[inputPlace] = motorcycle;
        size++;
        return true;
    }

    private static boolean checkFreePlace(int inputSize){
        if (inputSize == 10){
            System.out.println("Sorry, but there is no free place on Parking");
            return false;
        } else return true;
    }

    private static boolean checkStateParking(boolean stateParking){
        if (!stateParking){
            System.out.println("Sorry, but we are closed");
            return false;
        } else
            return true;
    }

    private static boolean checkInputNumber(int inputPlaceNumber){
        if (inputPlaceNumber > 10 || inputPlaceNumber < 0){
            System.out.println("Wrong input data");
            return false;
        } else
            return true;
    }

}
