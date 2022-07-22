package ChapterSeven;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CurrentDate {
    public static void main(String[] args) {
        LocalDate myDate = LocalDate.now();
        System.out.println("Current Date is: "+ myDate);
        LocalDateTime myCurrentTime = LocalDateTime.now();
        System.out.println("Today is: "+ myCurrentTime);

        // Formatting date

        DateTimeFormatter myFormattedDate = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDate = myCurrentTime.format(myFormattedDate);
        System.out.println("Formatted date: "+ formattedDate);



    }
}
