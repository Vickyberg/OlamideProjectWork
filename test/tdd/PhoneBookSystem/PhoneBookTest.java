package tdd.PhoneBookSystem;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PhoneBookTest {
    PhoneBook myPhoneBook;
    @BeforeEach
    void setMyPhoneBook() {
        myPhoneBook = new PhoneBook("Contact PhoneBook");
    }
    @Test
    void testThatPhoneBookIsEmpty(){
        myPhoneBook  = new PhoneBook("Contact PhoneBook");
       boolean phoneBook = myPhoneBook.isEmpty();
        assertTrue(phoneBook);
    }

       @Test
        void testWeCanHaveListOfContactInPhoneBook() throws Exception {
            myPhoneBook = new PhoneBook("Contact PhoneBook");
            myPhoneBook.createContact(1, "Olamide", "Victor",
                    "32,Emily Akinola,Akoka", "233-442-2442", "Olfkrm@gmail.com");
            Contact myContact = myPhoneBook.getContact(1);
            assertEquals(1, myContact.getContactId());

        }

        @Test
    void testWeCanAddMoreContactToTheListOfContacts() throws Exception {
        myPhoneBook = new PhoneBook("Contact PhoneBook");
        myPhoneBook.addContact(1, "Olamide", "Victor",
                "32,Emily Akinola,Akoka", "233-442-2442", "Olfkrm@gmail.com");
        Contact myContact = myPhoneBook.getContact(1);
        assertEquals(1,myPhoneBook.getContact(1).getContactId());
        myPhoneBook.addContact(2,"Ope","Charles","Sabo," +
                " Yaba","234-422-242","fjhjwrfhrw@gmail.com");
        assertEquals(2,myPhoneBook.getContact(2).getContactId());

        }

        @Test
    void testWeCanDeleteContactFromThePhoneBook(){
        myPhoneBook = new PhoneBook("Contact PhoneBook");
        myPhoneBook.createContact(1, "Olamide", "Victor",
                "32,Emily Akinola,Akoka", "233-442-2442", "Olfkrm@gmail.com");
        myPhoneBook.deleteContact(1);
        assertEquals(0,myPhoneBook.getContactNumber());


       }
       @Test
    void testWeCanEditContactInThePhoneBook() throws Exception {
           myPhoneBook = new PhoneBook("Contact PhoneBook");
           myPhoneBook.addContact(1, "Olamide", "Victor",
                   "32,Emily Akinola,Akoka", "233-442-2442", "Olfkrm@gmail.com");
           Contact newContact = myPhoneBook.getContact(1);
           newContact.setAddress("Sabo,Yaba");
           assertEquals("Sabo,Yaba",newContact.getAddress());

       }

    }


