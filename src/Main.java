import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ContactBook contactBook = new ContactBook();
        boolean exit = false;



        while(!exit) {
            System.out.println("***************************************");
            System.out.println("Welcome to your personal contact book!!");
            System.out.println("****************************************");
            System.out.println("""
                1. Add contact
                2. View contacts
                3. Search contact
                4. Delete contact
                5. Edit contact
                6. Exit
                """);
            System.out.print("Enter your choice: ");
            int choice = 0;

            // Input validation for choice
            try {
                choice = sc.nextInt();
                sc.nextLine();  // Consume newline character after integer input
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a number between 1 and 6.");
                sc.nextLine();  // Clear the buffer
                continue;  // Restart loop if invalid input is detected
            }
            switch (choice) {
                case 1 -> {
                    System.out.print("Enter the name: ");
                    String name = sc.nextLine();
                    System.out.println("Enter the Phone Number: ");
                    String phoneNumber = sc.nextLine();
                    System.out.println("Enter the email: ");
                    String email = sc.nextLine();
                    System.out.println("Enter the address: ");
                    String address = sc.nextLine();
                    Contact contact = new Contact(name, phoneNumber, email, address);
                    contactBook.addContact(contact);
                    System.out.println("Contact added successfully");
                }

                case 2 -> contactBook.viewAllContacts();
                case 3 -> {
                    System.out.print("Enter the name of the contact: ");
                    String name = sc.nextLine();
                    contactBook.searchContact(name);
                }

                case 4 -> {
                    System.out.print("Enter the name of the contact you wish to delete: ");
                    String name = sc.nextLine();
                    contactBook.removeContactByName(name);
                }

                case 5 -> {
                    System.out.print("Enter the name of the contact you wish to edit: ");
                    String name = sc.nextLine();
                    contactBook.editContactByName(name, sc);
                    System.out.println("Contact edited successfully");
                }


                case 6 -> {
                    System.out.println("Thank you!");
                    exit = true;
                }
                default -> System.out.println("Invalid choice");
        }
        }

        sc.close();



    }
}