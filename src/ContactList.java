/**
 * Created by macaque on 25.06.2016.
 */
public class ContactList {
    private int size;
    public Contact[] contactList = new Contact[10];

    public void addContact(Contact contact){
        if (size == contactList.length) {
            System.out.println("Sorry,your ContactList is full");
        } else {
            contactList[size] = contact;
            size++;
        }
    }

    public void deleteContact(String contact_name) {
        if (size == 0){
            System.out.println("Sorry, your ContactList is empty");
        } else {
             for (int i = 0; i < size; i++) {
                 if (contactList[i].name.equals(contact_name)){
                     contactList[i] = null;
                     size--;
                 }
             }
        }
    }

    public void showContactList() {
        String result = "";
        for (int i = 0; i < size; i++) {
            if (contactList[i] != null) {
                System.out.println(i + ". " + contactList[i].name + "\n");
            }
        }

    }

    public void findContact(String conact_name){
        int find_count = 0;
        for (int i = 0; i < size ; i++) {
            if (contactList[i].name.equals(conact_name)){
                contactList[i].showDetailsContact();
                find_count++;
            }
        }
        if (find_count == 0){
            System.out.println("Sorry, there is no " + "\"" + conact_name + "\"" + " in ContactList");
        }
    }
}
