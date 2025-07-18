import java.util.Scanner;

public class ContactManager{
    public static void main(String[] args){
        // System.out.println("Hi, Joshua");
        Scanner scanner = new Scanner(System.in);
        scanner.close();
        Contact first = new Contact(1, "Joshua", "9444658442", "samjoshuaa8@gmail.com", "", "");
        System.out.println(first.name);
    }
}