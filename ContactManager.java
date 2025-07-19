import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.BufferedReader;

public class ContactManager{
    // Contact[] contacts = new Contact[3];

    // public void new_contact(Contact contact){
    //     this.contacts[1] = contact;
    //     System.out.println("The Contact added successfully");
    // }

    // public void display(){
    //     System.out.print(contacts[1].index);
    // }

    public void write_csv(String filename, Contact contact){
        try (PrintWriter pw = new PrintWriter(filename)) {
            pw.write(contact.index + ", " + contact.name + ", " + contact.phoneNumber + ", " + contact.emailAddress + ", " + contact.address + ", " + contact.notes);
        } 
        catch (FileNotFoundException e) {
            System.out.println("File not found :(");
            // e.printStackTrace();
        }
    }

    public void read_csv(String filename){
        String line = "";

        try (BufferedReader br = new BufferedReader(new FileReader(filename))){
            while((line = br.readLine()) != null){
                System.out.println(line);
            }
        }   
        catch (FileNotFoundException e){
            e.printStackTrace();
        }   
        catch (IOException e){
            e.printStackTrace();
        } 
    }


}