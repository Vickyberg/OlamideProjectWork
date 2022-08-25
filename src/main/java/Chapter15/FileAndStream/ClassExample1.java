package Chapter15.FileAndStream;

import java.io.*;

public class ClassExample1 {
    public static void main(String[] args) {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(inputStreamReader);
        try {
            String userResponse = reader.readLine();
            System.out.println("LINE::::" + userResponse.toUpperCase());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
