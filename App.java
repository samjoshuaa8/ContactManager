// import java.util.Scanner;

public class App {
        public static void main(String[] args){
        // System.out.println("Hi, Joshua");

        String filename = "contacts.csv";

        // Scanner scanner = new Scanner(System.in);
        // scanner.close();

        ContactManager cm = new ContactManager();

        // Contact c = new Contact(1, "Joshua", "9444658442", "samjoshuaa8@gmail.com", "", "");
        // System.out.println(c.name);
        // cm.new_contact(c);
        // cm.write_csv(filename, c);

        // cm.read_csv(filename);

        // ArrayList<Contact> cs = cm.loadContacts(filename);
        // for (Contact i : cs){
        //     System.out.println(i.name);
        // }

        // Contact c = new Contact("Joshua", "9444658442", "samjoshuaa8@gmail.com", " ", " ");
        // cs.add(c);

        // cm.exportContacts(filename, cs);

        // ArrayList<Contact> _cs = cm.loadContacts(filename);
        // System.out.println(_cs.size());

        cm.loadContacts(filename);
        // System.out.println(cm.contacts.size());

        cm.addContact("Dick Grayson","555-456-7890","dick.grayson@batfamily.org","Wayne Manor, Gotham City","Holy [exclamation], Batman!");
        cm.displayContacts();
        cm.searchContacts("de");
        cm.updateContact(8, "Dick Grayson (Robin)","555-456-7890","dick.grayson@batfamily.org","Wayne Manor, Gotham City","Holy [exclamation], Batman!");
        cm.deleteContact(8);

        cm.exportContacts(filename);
        // System.out.println(cm.contacts.size());
    }
}
