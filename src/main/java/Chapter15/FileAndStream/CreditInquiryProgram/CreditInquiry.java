package Chapter15.FileAndStream.CreditInquiryProgram;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class CreditInquiry {
    private  final static  MenuOption[] choices = MenuOption.values();

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        MenuOption accountType  = getRequest(input);


    }

    private static  MenuOption getRequest(Scanner input){
        int request = 4;
        System.out.printf("%nEnter request%n%s%n%s%n%s%n%s%n",
                "1-> List accounts with zero balances",
                "2->List accounts with credit balances",
                "3->List accounts with debit balances",
                "4->Terminate program");
        try {
            do {
                System.out.printf("%n? ");
                request = input.nextInt();
            }while ((request< 1 ) || (request > 4));
        }catch (NoSuchElementException noSuchElementException){
            System.err.println("Invalid input. Terminating.");
        }
        return  choices[request - 1];
    }
}
