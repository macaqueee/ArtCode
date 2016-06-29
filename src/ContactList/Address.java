package ContactList;

/**
 * Created by macaque on 25.06.2016.
 */
public class Address {
    int numberHouse;
    String city;
    String street;

    public void initAddress(String input_city, String input_street, int input_numberHouse){

        city = input_city;
        street = input_street;
        numberHouse = input_numberHouse;

    }
    public String printAddress(){
        return city + street + numberHouse;
    }
}
