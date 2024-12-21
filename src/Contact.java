public class Contact {
    String fName;
    String lName;
    String city;
    String state;
    String email;
    long phone;
    int zip;

    public Contact(String fName, String lName, String city, String state, String email, long phone, int zip) {
        this.fName = fName;
        this.lName = lName;
        this.city = city;
        this.state = state;
        this.email = email;
        this.phone = phone;
        this.zip = zip;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", email='" + email + '\'' +
                ", phone=" + phone +
                ", zip=" + zip +
                '}';
    }

}
