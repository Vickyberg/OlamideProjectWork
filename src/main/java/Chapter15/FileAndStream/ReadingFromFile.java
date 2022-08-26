package Chapter15.FileAndStream;

import java.io.*;

public class ReadingFromFile {
    public static void main(String[] args) {
        try {

            FileReader fileReader = new FileReader(
                    "C:\\Users\\Olamide\\OlamideProjectWork\\src\\main\\java\\Chapter15\\FileAndStream\\test.txt");
            BufferedReader reader = new BufferedReader(fileReader);

            String sentence = reader.readLine();
            System.out.println(sentence);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
