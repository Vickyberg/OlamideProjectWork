package tdd.PhoneBookSystem;


import java.util.ArrayList;

public class PhoneBook {
    private String phoneBookType;
    private ArrayList<Contact> contacts;
    private boolean isEmpty = true;

    public PhoneBook(String  phoneBookType) {
        this.phoneBookType = phoneBookType;

        this.contacts = new ArrayList<Contact>();
    }
    public boolean isEmpty() {
        return isEmpty;
    }

    public void createContact(int contactId,String firstName,String
            secondName, String address,String contactNo,String emailAddress) {

        Contact contact = new Contact(contactId,firstName, secondName, address, contactNo, emailAddress);
        contacts.add(contact);

    }

    public Contact getContact(int contactId) throws Exception {
        for (Contact contact : contacts){
            if(contact.getContactId() == contactId){
                return contact;
            }

        }

        throw new Exception("Contact Not Found!!");
    }

    public ArrayList<Contact> getContacts(){
        return contacts;
    }


    public void addContact(int contactId, String firstName, String secondName,
                           String address, String contactNo, String emailAddress) {
        Contact newContact = new Contact(contactId, firstName, secondName, address, contactNo, emailAddress);
        contacts.add(newContact);

    }
}
