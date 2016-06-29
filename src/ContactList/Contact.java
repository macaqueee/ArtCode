package ContactList;

/**
 * Created by macaque on 25.06.2016.
 */
public class Contact {
    String name;
    String phone;
    Address address;
    int count;

    public void initContact(String input_name, String input_phone, Address input_address) {

        address = input_address;
        name = input_name;
        phone = input_phone;
}
    public void showDetailsContact(){
        System.out.println(name + " " + phone  +  " " + address.city + " "
                + address.street + " " + address.numberHouse + "\n");
    }
}
