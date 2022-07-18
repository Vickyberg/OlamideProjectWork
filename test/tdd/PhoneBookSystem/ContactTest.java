package tdd.PhoneBookSystem;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ContactTest {
    Contact myContact;
    @BeforeEach
    void setMyContact(){
        myContact =  new Contact(1,"Victor","Olamide","32," +
                "Emily Akinola,Akoka","090-342-2424","olamid098@gmail.com");
    }

    @Test
    void testThatWeCanCreateContact(){
        myContact = new Contact(1,"Victor","Olamide","32," +
                "Emily Akinola,Akoka","090-342-2424","olamid098@gmail.com");
        int contactId = myContact.getContactId();
        assertEquals(1,contactId);
    }
}
