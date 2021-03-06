package ContactList;

/**
 * Created by macaque on 25.06.2016.
 */
public class ContactList {
    public int size;
    public Contact[] contactList = new Contact[10];

    public void addContact(Contact contact){
        if (size == contactList.length) {
            System.out.println("Sorry,your ContactList.ContactList is full");
        } else {
            contactList[size] = contact;
            size++;
        }
    }

    public void deleteContact(String contact_name) {
        if (size == 0){
            System.out.println("Sorry, your ContactList.ContactList is empty");
        } else {
             for (int i = 0; i < size; i++) {
                 if (contactList[i].name.equals(contact_name)){
                     eraseContact(i);
                 }
             }
        }
    }

    private void eraseContact(int number){

        for (int i = number; i <size-1; i++) {
            contactList[i] = contactList[i+1];
        }
        size--;
        contactList[size] = null;
    }

    public void showContactList() {
        String result = "";
        for (int i = 0; i < size; i++) {
            if (contactList[i] != null) {
                System.out.println(i + ". " + contactList[i].name + "\n");
            }
        }
    }

    public void showFirstfive(){
        String result = "";
        if (size == 0){
            System.out.println("Sorry, your ContactList.ContactList is empty");
        }
        if (size <= 5){
            showContactList();
        } else {
            for (int i = 0; i <5 ; i++) {
                result += contactList[i].name + "\n";
            }
        }
    }

    public void showLastFive(){
        String result = "";
        if (size == 0){
            System.out.println("Sorry, your ContactList.ContactList is empty");
        }
        if (size <= 5){
            showContactList();
        } else {
            for (int i = size-5; i < size ; i++) {
                result += contactList[i].name + "\n";
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
            System.out.println("Sorry, there is no " + "\"" + conact_name + "\"" + " in ContactList.ContactList");
        }
    }
}
