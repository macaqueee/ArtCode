import java.util.Scanner;

/**
 * Created by macaque on 26.06.2016.
 */
public class ContactListMenu {
    private Scanner scanner = new Scanner(System.in);

    public void start(ContactList contactList){
        while(true){
            showMainMenu();


            int choice = validateInput();

            if (choice == 1){
                showAddContactMenu(contactList);
            } else if (choice == 2) {
                contactList.showContactList();
            } else if (choice == 3) {
                showContactDetails(contactList);
            } else if (choice == 4){
                showContactListJSON(contactList);
            } else if (choice == 5){
                deleteContactMenu(contactList);
            } else if (choice == 0){
                break;
            }
        }
    }

    private void showContactListJSON(ContactList contactList) {
        String result = ToJSONConverter.contactListToJSON(contactList);
        System.out.println(result);
    }

    private void deleteContactMenu(ContactList contactList) {
        System.out.println("Input contact name you want to delete");
        String name = scanner.next();
        contactList.deleteContact(name);

    }

    private void showContactDetails(ContactList contactList) {
        System.out.println("Input contact name you want to see");
        String name = scanner.next();
        contactList.findContact(name);
    }

    private void showAddContactMenu(ContactList contactList){
        System.out.println("Input name");
        String name = scanner.next();
        System.out.println("Input phone");
        String phone = scanner.next();
        System.out.println("Input address:city");
        String address_city = scanner.next();
        System.out.println("Input address:street");
        String address_street = scanner.next();
        System.out.println("Input address:homeNumber");
        int address_num = validateInput();

        Address address_contact = new Address();
        address_contact.addAddress(address_city, address_street, address_num);

        Contact contact = new Contact();
        contact.initContact(name,phone,address_contact);
        contactList.addContact(contact);
    }

    private void showMainMenu(){
        System.out.println("1. Add contact");
        System.out.println("2. Show All");
        System.out.println("3. Show contact details");
        System.out.println("4. Show All in JSON format");
        System.out.println("5. Delete contact");
        System.out.println("0. Exit");
    }

    private int validateInput(){
        int number;
        do {
            System.out.print("Input number, please: \n");
            while (!scanner.hasNextInt()) {
                String input = scanner.next();
                System.out.printf("%s is not a valid number.\n", input);
            }
            number = scanner.nextInt();
        } while (number < 0);
        return  number;
    }

}
