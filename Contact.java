public class Contact{
    String index;
    String name;
    String phoneNumber;
    String emailAddress;
    String address;
    String notes;

    public Contact(String index, String name, String phoneNumber, String emailAddress, String address, String notes){
        this.index = index;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
        this.address = address;
        this.notes = notes;
    }

    public String toText(){
        return String.format("%3S. | %-15S | %-15S | %-35S | %-50S | %-70S", this.index, this.name, this.phoneNumber, this.emailAddress, this.address, this.notes);
    }
}