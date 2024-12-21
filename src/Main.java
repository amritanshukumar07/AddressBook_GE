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
            System.out.println("Enter 1 -> Create new contact \nEnter 2-> Display existing contacts\nEnter 0 -> Exit");
            int input= sc.nextInt();
            switch (input){
                case 0 -> i=0;
               case 1 -> a1.createContact();
               case 2 -> a1.display();
                default -> System.out.println("Wrong Input");
            }

        }while (i!=0);

        System.out.println("Thanks for using AddressBook");
        sc.close();
    }
}