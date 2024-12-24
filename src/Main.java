import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        AddressBook a1= new AddressBook();
        int i=1;
        Scanner sc= new Scanner(System.in);
        System.out.println("Welcome to addressbook");
        do{
            System.out.println("Enter 1 -> Create new contact \n" +
                               "Enter 2 -> Display existing contacts\n" +
                               "Enter 3 -> Edit a contact \n" +
                               "Enter 4 ->Delete a contact\n"+
                               "Enter 0 -> Exit");
            int input= sc.nextInt();
            switch (input){
                case 0 -> i=0;
               case 1 -> a1.createContact();
               case 2 -> a1.display();
               case 3 -> {
                   System.out.println("Enter the first name and last name of the contact to be edited");
                   String firstName= sc.next();
                   String lastName= sc.next();
                   a1.EditContactUsingName(firstName,lastName);
               }
               case 4 -> {
                   System.out.println("Enter the first name and last name of the contact to be deleted");
                   String firstName= sc.next();
                   String lastName= sc.next();
                   a1.DeleteContactUsingName(firstName,lastName);
               }
                default -> System.out.println("Wrong Input");
            }

        }while (i!=0);

        System.out.println("Thanks for using AddressBook");
        sc.close();
    }
}