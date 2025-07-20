import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import java.io.BufferedReader;
import java.io.BufferedWriter;

import java.util.ArrayList;

public class ContactManager{
    // Contact[] contacts = new Contact[3];
    ArrayList<Contact> contacts = new ArrayList<>();

    // public void new_contact(Contact contact){
    //     this.contacts[1] = contact;
    //     System.out.println("The Contact added successfully");
    // }

    // public void display(){
    //     System.out.print(contacts[1].index);
    // }

    public ArrayList<Contact> loadContacts(String filename){
        // this.contacts.clear();
        String line = "";
        try(BufferedReader br = new BufferedReader(new FileReader(filename))){
            while((line = br.readLine()) != null){
                // String[] s = line.split(","); 
                String[] s = line.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)"); //
                Contact c = new Contact(s[0], s[1], s[2], s[3], s[4], s[5]);
                this.contacts.add(c);
            }
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
        catch(IOException e){
            e.printStackTrace();
        }
        return this.contacts;
    }

    public void displayContacts(){
        for(Contact c : this.contacts){
            System.out.println(c.toText());
        }
    }

    public void addContact(String index, String name, String phoneNumber, String emailAddress, String address, String notes){
        this.contacts.add(new Contact(index, name, phoneNumber, emailAddress, "\""+address+"\"", "\""+notes+"\""));
    }

    public void exportContacts(String filename){
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(filename))){
            for(int i = 0; i<this.contacts.size(); i++){
                Contact item = this.contacts.get(i);
                bw.write(item.index + "," +item.name + "," + item.phoneNumber + "," + item.emailAddress + "," + item.address + "," + item.notes+"\n");
            }
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }

    // public void write_csv(String filename, Contact contact){
    //     try (PrintWriter pw = new PrintWriter(filename)) {
    //         pw.write(contact.index + ", " + contact.name + ", " + contact.phoneNumber + ", " + contact.emailAddress + ", " + contact.address + ", " + contact.notes);
    //     } 
    //     catch (FileNotFoundException e) {
    //         System.out.println("File not found :(");
    //         // e.printStackTrace();
    //     }
    // }

    // public void read_csv(String filename){
    //     String line = "";

    //     try (BufferedReader br = new BufferedReader(new FileReader(filename))){
    //         while((line = br.readLine()) != null){
    //             System.out.println(line);
    //         }
    //     }   
    //     catch (FileNotFoundException e){
    //         e.printStackTrace();
    //     }   
    //     catch (IOException e){
    //         e.printStackTrace();
    //     } 
    // }


}