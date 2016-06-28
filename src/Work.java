/**
 * Created by macaque on 25.06.2016.
 */
public class Work {


    public static void main(String[] args) {
        Contact s1 = new Contact();
        Contact s2 = new Contact();

        Address address1 = new Address();
        Address address2 = new Address();
        address1.addAddress("Kiev","Khreshatyk ",4);
        address2.addAddress("Fastiv","Soborna ",6);

        s1.initContact("Oleg ","+38093034545 ",address1);
        s1.showDetailsContact();

        s2.initContact("Valera ","+3809511111 ",address2);
        s2.showDetailsContact();

        ContactList s3 = new ContactList();

        s3.addContact(s1);
        s3.addContact(s2);

      /*  System.out.println(s3.count);
        s3.deleteContact(s1);
        s3.deleteContact(s2);
        System.out.println(s3.count); */

        s3.showContactList();

      /*  String addressToJSON = ua.artcode.week1.day2.ToJSONConverter.addressToJSON(address1);
        System.out.println(addressToJSON);

        String conToJSON = ua.artcode.week1.day2.ToJSONConverter.contactToJSON(s1);
        System.out.println(conToJSON); */

        String contactListToJSON = ToJSONConverter.contactListToJSON(s3);
        System.out.println(contactListToJSON);

        //   s3.showContactDetail(s1);
      //  s3.showContactDetail(s2);
    }
}
