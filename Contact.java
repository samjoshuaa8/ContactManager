public class Contact{
    String name;
    String phoneNumber;
    String emailAddress;
    String address;
    String notes;

    public Contact(String name, String phoneNumber, String emailAddress, String address, String notes){
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
        this.address = address;
        this.notes = notes;
    }

    public String toText(int index){
        return String.format("%3d. | %-15S | %-15S | %-35S | %-50S | %-70S", index, this.name, this.phoneNumber, this.emailAddress, this.address, this.notes).toLowerCase();
    }
}