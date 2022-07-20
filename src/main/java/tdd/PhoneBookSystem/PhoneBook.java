package tdd.PhoneBookSystem;


import java.util.ArrayList;

public class PhoneBook {
    private String phoneBookType;
    private int counter;
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
    Contact foundContact = findById(contactId);
    for (var contact : contacts){
        if(contact == foundContact){
            return contact ;
        }
    }

        throw new Exception("Contact Not Found!!");
    }

    private Contact findById(int contactId) {
        for (var contact: contacts){
            if(contact.getContactId() == contactId){
                return contact;
            }
        }
        return null;
    }

    public ArrayList<Contact> getContacts(){
        return contacts;
    }


    public void addContact(int contactId, String firstName, String secondName,
                           String address, String contactNo, String emailAddress) {
        Contact newContact = new Contact(contactId, firstName, secondName, address, contactNo, emailAddress);
        contacts.add(newContact);

    }

    public void deleteContact(int contactId) {
        int initialArrayList = contacts.size();
        for(Contact contact : contacts){
            if(contact.getContactId() == contactId){
                contacts.remove(contact);
                break;
            }
        }
    }

    public int getContactNumber() {
        return contacts.size();
    }

    public int getCount() {
        return  contacts.size();
    }
}
