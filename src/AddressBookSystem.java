import java.util.HashMap;

public class AddressBookSystem {
    HashMap<String,AddressBook> AddressLibrary= new HashMap<>();

    // Adding a address book
    public void addAddressBook(String name){
        if(AddressLibrary.containsKey(name)){
            System.out.println("AddressBook with this name already exists");
        }else {
            AddressLibrary.put(name, new AddressBook());
            System.out.println("AddressBook : "+name+" added");
        }
    }
    // get addressbook by name
    public AddressBook getAddressBook(String name){
        if(!AddressLibrary.containsKey(name))
            System.out.println("No addressbook is available with this name");

        else
            return AddressLibrary.get(name);

        return null;
    }

    // Display
    public void displayAddressBook(){
        System.out.println("Available addressBooks "+ AddressLibrary.keySet() );
    }

    //Delete

    public void deleteAddressBook(String name){
        if(AddressLibrary.containsKey(name)){

            AddressLibrary.remove(name);
            System.out.println("Address Book :"+name+ " Successfully deleted");
        }
        else {
            System.out.println("No addressbook is available with this name");
        }
    }
}
