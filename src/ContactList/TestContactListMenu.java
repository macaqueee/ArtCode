package ContactList;

/**
 * Created by macaque on 27.06.2016.
 */
public class TestContactListMenu {

    public static void main(String[] args) {
        ContactList contactList = new ContactList();

        ContactListMenu menu = new ContactListMenu();
        menu.start(contactList);
    }
}
