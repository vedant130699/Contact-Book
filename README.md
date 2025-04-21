Personal Contact Book
This is a simple command-line application written in Java that allows users to manage their personal contacts. The application provides basic features such as adding, viewing, searching, deleting, and editing contacts.

Features
Add Contact: Allows the user to add a new contact with details such as name, phone number, email, and address.

View Contacts: Displays a list of all contacts stored in the contact book.

Search Contact: Allows the user to search for a contact by name.

Delete Contact: Enables the user to remove a contact from the contact book by name.

Edit Contact: Allows the user to update a contact's details (name, phone number, email, or address).

Exit: Exits the application.

Requirements
Java 8 or higher

How to Run
Step 1: Clone the repository
Clone the repository to your local machine:

bash
Copy
Edit
git clone https://github.com/vedant130699/contact-book.git
Step 2: Compile the Java files
Navigate to the directory where the files are located and compile the Java files:

Copy
Edit
javac Main.java Contact.java ContactBook.java
Step 3: Run the program
After compiling, run the Main class to start the application:


Copy
Edit
java Main
Step 4: Use the application
Once the application is running, you will see the following menu options:

markdown
Copy
Edit
***************************************
Welcome to your personal contact book!!
****************************************
1. Add contact
2. View contacts
3. Search contact
4. Delete contact
5. Edit contact
6. Exit
You can interact with the application by entering the number corresponding to the action you want to perform.

Example Usage
Add Contact:

Enter 1 to add a new contact.

Provide the contact details such as name, phone number, email, and address.

View Contacts:

Enter 2 to see all the contacts stored in the contact book.

Search Contact:

Enter 3 and provide the name of the contact you want to search for.

Delete Contact:

Enter 4 and provide the name of the contact you wish to delete.

Edit Contact:

Enter 5 and provide the name of the contact you want to edit. You will be prompted to choose which details to edit (name, phone number, email, or address).

Exit:

Enter 6 to exit the application.

Example of Output
markdown
Copy
Edit
***************************************
Welcome to your personal contact book!!
****************************************
1. Add contact
2. View contacts
3. Search contact
4. Delete contact
5. Edit contact
6. Exit
Enter your choice: 1
Enter the name: John Doe
Enter the Phone Number: 1234567890
Enter the email: john.doe@example.com
Enter the address: 123 Main St, Springfield
Contact added successfully

***************************************
Welcome to your personal contact book!!
****************************************
1. Add contact
2. View contacts
3. Search contact
4. Delete contact
5. Edit contact
6. Exit
Enter your choice: 2
Contact{name='John Doe', phoneNumber='1234567890', email='john.doe@example.com', address='123 Main St, Springfield'}
Code Overview
Main Class: This is the entry point of the application. It handles user interaction, displays the menu, and calls appropriate methods from the ContactBook class.

Contact Class: Represents a contact with fields for name, phone number, email, and address. It also contains getter and setter methods for each field and a toString method for displaying the contact details.

ContactBook Class: Contains an ArrayList to store contacts. It provides methods to add, search, view, delete, and edit contacts.
