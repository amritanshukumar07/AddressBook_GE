import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBook {
    List<Contact>  adBook= new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    public void createContact(){

        System.out.println("Enter First name");
        String name = sc.next();
        System.out.println("Enter Last name");
        String lname = sc.next();
        System.out.println("Enter City");
        String city = sc.next();
        System.out.println("Enter State");
        String state = sc.next();
        System.out.println("Enter Email ID");
        String email = sc.next();
        System.out.println("Enter Phone no.");
        long phone = sc.nextLong();
        System.out.println("Enter ZipCode");
        int zip = sc.nextInt();
        Contact c1 = new Contact(name, lname, city, state, email, phone, zip);
        adBook.add(c1);
        System.out.println("Contact is added");
    }

    public void EditContactUsingName(String fName,String lName){
     for(Contact contact: adBook){
         if(contact.getfName().equalsIgnoreCase(fName) && contact.getlName().equalsIgnoreCase(lName)){
             Scanner sc= new Scanner(System.in);
             System.out.println("Enter new city");
             contact.setCity(sc.next());
             System.out.println("Enter new state");
             contact.setState(sc.next());
             System.out.println("Enter new email");
             contact.setEmail(sc.next());
             System.out.println("Enter new phone");
             contact.setPhone(sc.nextLong());
             System.out.println("Enter new zip");
             contact.setZip(sc.nextInt());
             System.out.println("Contact updated successfully");
             return;
         }
     }
        System.out.println("Contact not found");
    }
    public void DeleteContactUsingName(String fName, String lName){
        for(Contact contact: adBook){
            if(contact.getfName().equalsIgnoreCase(fName) && contact.getlName().equalsIgnoreCase(lName)){
                adBook.remove(contact);
                System.out.println("Contact Deleted Successfully");
                return;
            }
        }
        System.out.println("Contact not found");
    }
    public void AddMultipleContact(){
        System.out.println("Enter the number of contacts to be added");
        int n= sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.println("Contact "+ (i+1)+ " : ");
            createContact();
        }
    }
    public void display(){
        System.out.println(adBook);
    }
}
