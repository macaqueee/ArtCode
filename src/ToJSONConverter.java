/**
 * Created by macaque on 26.06.2016.
 */
public class ToJSONConverter {

    public static String addressToJSON(Address address){
        return String.format(
                "{\n \"city\" : %s,\n \"street\" : %s,\n \"num\" : %d \n}",
                address.city, address.street, address.numberHouse);
    }


    public static String contactToJSON(Contact contact){
        return String.format(
                "{\n \"name\" : %s,\n \"phone\" : %s,\n \"address\" : %s\n}",
                contact.name, contact.phone, addressToJSON(contact.address));
    }


    public static  String contactListToJSON(ContactList list){
      String temp =  "";
        for (int i = 0; i <list.contactList.length ; i++) {
            if (list.contactList[i] != null) {
                temp += contactToJSON(list.contactList[i]) + "," + "\n";
            } else temp += "";
        }
           // return "{" + "\n" + "\"list\"" + ":" + "\n"+ temp.substring(0,temp.length()-1) + "\n"+ "}";
            return  temp.substring(0,temp.length()-2);
    }

}
