import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    //    AddressBook a1= new AddressBook();
        AddressBookSystem addLib= new AddressBookSystem();
        AddressBook cr=null;
        int i=1;
        Scanner sc= new Scanner(System.in);
        System.out.println("Welcome to addressbook system");
        do{
            System.out.println("Enter 1 -> Create new Address Book \n" +
                               "Enter 2 -> Display existing contacts of an Address Book\n" +
                               "Enter 3 -> Edit a contact of an Address Book \n" +
                               "Enter 4 -> Delete a contact from an Address Book\n"+
                               "Enter 5 -> Add Multiple Contacts to an Address Book\n"+
                               "Enter 6 -> Display all AddressBooks\n"+
                               "Enter 7 -> Delete an Address Book from the system\n"+
                               "Enter 8 -> Add an contact to the AddressBook\n"+
                               "Enter 0 -> Exit");
            int input= sc.nextInt();
            switch (input){
                case 0 -> i=0;
               case 1 ->{
                   System.out.println("Enter the name of new AddressBook");
                  String name= sc.next();
                  addLib.addAddressBook(name);
               }
               case 2 -> {
                   System.out.println("Enter the name of Addressbook to display the contacts");
                   String name= sc.next();
                   cr= addLib.getAddressBook(name);
                   cr.display();
               }
               case 3 -> {
                   System.out.println("Enter the name of Addressbook whose contacts is to be edited");
                   String name= sc.next();
                   cr= addLib.getAddressBook(name);
                   System.out.println("Enter the first name and last name of the contact to be edited");
                   String firstName= sc.next();
                   String lastName= sc.next();
                   cr.EditContactUsingName(firstName,lastName);
               }
               case 4 -> {
                   System.out.println("Enter the name of Addressbook whose contacts is to be deleted");
                   String name= sc.next();
                   cr= addLib.getAddressBook(name);
                   System.out.println("Enter the first name and last name of the contact to be deleted");
                   String firstName= sc.next();
                   String lastName= sc.next();
                   cr.DeleteContactUsingName(firstName,lastName);
               }
               case 5->{
                   System.out.println("Enter the name of Addressbook in which multiple contacts are to be added");
                   String name= sc.next();
                   cr= addLib.getAddressBook(name);
                   cr.AddMultipleContact();
               }
               case 6->{
                   addLib.displayAddressBook();
               }
               case 7->{
                   System.out.println("Enter the name of the addrressbook to be deleted");
                   String name= sc.next();
                   addLib.deleteAddressBook(name);

               }
               case 8 -> {
                   System.out.println("Enter the name of Addressbook whose contacts is to be deleted");
                   String name= sc.next();
                   cr= addLib.getAddressBook(name);
                   cr.createContact();
               }
                default -> System.out.println("Wrong Input");
            }

        }while (i!=0);

        System.out.println("Thanks for using AddressBook");
        sc.close();
    }
}