package Chapter15.FileAndStream;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class WritingToFile {
    public static void main(String[] args) {
        try( PrintWriter writer = new PrintWriter("C:\\Users\\Olamide\\OlamideProjectWork\\src\\main\\java\\Chapter15\\FileAndStream\\test.txt")) {

           writer.println("Oma is a princess");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
