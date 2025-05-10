class Contact {
    String name, phoneNumber, emailAddress;
    Contact(String n, String p, String e) {
        name = n; phoneNumber = p; emailAddress = e;
    }
    void display() {
        if (!emailAddress.equals(""))
            System.out.println("Contact: " + name + ", Phone: " + phoneNumber + ", Email: " + emailAddress);
    }
}

public class Homework8 {
    public static void main(String[] args) {
        Contact c1 = new Contact("Suraj", "1234567890", "suraj@example.com");
        Contact c2 = new Contact("Momzee", "0987654321", "");
        Contact c3 = new Contact("Momzer", "1111111111", "momzer@example.com");
        c1.display(); c2.display(); c3.display();
    }
}
