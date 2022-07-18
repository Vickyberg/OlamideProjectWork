package tdd.PhoneBookSystem;

public class Contact {
    private int contactId;
    private  String firstName;
    private  String secondName;
    private String address;
    private String contactNo;
    private String emailAddress;



    public Contact(int contactId,String firstName, String secondName, String address, String contactNo, String emailAddress) {
       this.contactId = contactId;
        this.firstName = firstName;
        this.secondName = secondName;
        this.address = address;
        this.contactNo = contactNo;
        this.emailAddress = emailAddress;
    }

    public int getContactId() {
        return contactId;
    }

    public void setContactId(int contactId) {
        this.contactId = contactId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String toString(){
        return String.format("%s %s%s%n %s%s%n %s%s%n %s%s%n","Name: ",
                getFirstName(),getSecondName(),"Address: ",getAddress(),"Contact No: ",
                getContactNo(),"Email Address: ",getEmailAddress());
    }
}
