import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import java.io.PrintWriter;
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
        contacts.clear();
        String line = "";
        try(BufferedReader br = new BufferedReader(new FileReader(filename))){
            while((line = br.readLine()) != null){
                String[] s = line.split(","); 
                Contact c = new Contact(s[0], s[1], s[2], s[3], s[4], s[5]);
                contacts.add(c);
            }
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
        catch(IOException e){
            e.printStackTrace();
        }
        return contacts;
    }

    public void exportContacts(String filename, ArrayList<Contact> contacts){
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(filename))){
            for(int i = 0; i<contacts.size(); i++){
                Contact item = contacts.get(i);
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