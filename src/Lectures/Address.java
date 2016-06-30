package Lectures;

/**
 * Created by macaque on 29.06.2016.
 */
public class Address {
    public String city;
    public String street;
    public int numHouse;


    public Address(String inputCity, String inputStreet, int inputNumHouse){

        city = inputCity;
        street = inputStreet;
        numHouse = inputNumHouse;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setNumHouse(int numHouse) {
        this.numHouse = numHouse;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public int getNumHouse() {
        return numHouse;
    }

    public String printAddress(){
        return city + street + numHouse;
    }

}
