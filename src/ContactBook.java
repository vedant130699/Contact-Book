import java.util.ArrayList;
import java.util.Scanner;

public class ContactBook {
    private ArrayList<Contact> contacts;

    public ContactBook() {
        contacts = new ArrayList<>();
    }

    public void addContact(Contact contact) {
        contacts.add(contact);
    }

    public void searchContact(String name) {
        boolean found = false;
        for(Contact contact : contacts) {
            if(contact.getName().equalsIgnoreCase(name)) {
                System.out.println("Contact found!");
                System.out.println(contact);
                found = true;
                break;
            }
        }
        if(!found) System.out.println("Contact not found");
    }

    public void editContactByName(String name, Scanner sc) {
       Contact contactToEdit = null;
       for(Contact contact: contacts) {
           if(contact.getName().equalsIgnoreCase(name)){
               contactToEdit = contact;
               break;
           }
       }
       if(contactToEdit == null) {
           System.out.println("Contact not found");
           return;
       }

        System.out.println("""
        What do you want to edit?
        1. Name
        2. Phone
        3. Email
        4. Address
    """);

       int choice = sc.nextInt();
       sc.nextLine();

       switch (choice) {
           case 1-> {
               System.out.print("Enter new Name: ");
               String newName = sc.nextLine();
               contactToEdit.setName(newName);
           }
           case 2-> {
               System.out.print("Enter new Phone Number: ");
               String newPhoneNumber = sc.nextLine();
               contactToEdit.setPhoneNumber(newPhoneNumber);
           }
           case 3-> {
               System.out.print("Enter new Email: ");
               String newEmail = sc.nextLine();
               contactToEdit.setEmail(newEmail);
           }
           case 4-> {
               System.out.print("Enter new Address: ");
               String newAddress = sc.nextLine();
               contactToEdit.setAddress(newAddress);
           }


       }
    }



    public void removeContactByName(String name) {
        Contact toRemove = null;
        for (Contact contact : contacts) {
            if (contact.getName().equalsIgnoreCase(name)) {
                toRemove = contact;
                break;
            }
        }

        if (toRemove != null) {
            contacts.remove(toRemove);
            System.out.println("Contact " + name + " was removed successfully");
        } else {
            System.out.println("Contact " + name + " not found..");
        }


    }

    public void viewAllContacts() {
        if (contacts.isEmpty()) {
            System.out.println("No contacts to display.");
            return;
        }
        for (Contact contact : contacts) {
            System.out.println(contact);
        }
    }




}
