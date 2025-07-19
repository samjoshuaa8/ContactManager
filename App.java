import java.util.Scanner;

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

        cm.read_csv(filename);
    }
}
