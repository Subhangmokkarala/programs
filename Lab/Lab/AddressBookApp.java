package Lab.App;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Serializable;
import java.util.ArrayList;

class Contact implements Serializable {
    private String name;
    private String phoneNumber;
    private String email;

    public Contact(String name, String phoneNumber, String email) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\nPhone: " + phoneNumber + "\nEmail: " + email;
    }
}

public class AddressBookApp {
    private JFrame frame;
    private DefaultListModel<Contact> contactListModel;
    private JList<Contact> contactList;
    private JTextField nameField;
    private JTextField phoneField;
    private JTextField emailField;
    private ArrayList<Contact> contacts;

    public AddressBookApp() {
        frame = new JFrame("Address Book");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        contacts = loadContacts();
        contactListModel = new DefaultListModel<>();
        contactList = new JList<>(contactListModel);
        for (Contact contact : contacts) {
            contactListModel.addElement(contact);
        }

        JButton editButton = new JButton("Edit");
        editButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int selectedIndex = contactList.getSelectedIndex();
                if (selectedIndex >= 0) {
                    Contact contact = contactListModel.getElementAt(selectedIndex);
                    contact.setName(nameField.getText());
                    contact.setPhoneNumber(phoneField.getText());
                    contact.setEmail(emailField.getText());
                    contactListModel.set(selectedIndex, contact);
                    saveContacts(contacts);
                    clearFields();
                }
            }
        });

        JButton deleteButton = new JButton("Delete");
        deleteButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int selectedIndex = contactList.getSelectedIndex();
                if (selectedIndex >= 0) {
                    contacts.remove(selectedIndex);
                    contactListModel.remove(selectedIndex);
                    saveContacts(contacts);
                    clearFields();
                }
            }
        });
    }

    private void clearFields() {
        nameField.setText("");
        phoneField.setText("");
        emailField.setText("");
    }

    private ArrayList<Contact> loadContacts() {
        // Implement loading of contacts from a file here
        // Example: Deserialize contacts from a file
        return new ArrayList<>();
    }

    private void saveContacts(ArrayList<Contact> contacts) {
        // Implement saving of contacts to a file here
        // Example: Serialize contacts and save them to a file
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new AddressBookApp());
    }
}
