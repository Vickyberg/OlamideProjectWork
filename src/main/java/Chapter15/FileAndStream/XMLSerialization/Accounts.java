package Chapter15.FileAndStream.XMLSerialization;



import java.util.ArrayList;
import java.util.List;
//import javax.xml.bind.annotation.XmlElement;

public class Accounts {

    private List<Account> accounts = new ArrayList<>();

    public List<Account> getAccounts() {
        return accounts;
    }
}

