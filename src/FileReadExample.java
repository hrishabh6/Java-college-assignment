package src;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReadExample {
    public static void main(String[] args) {
        try {
            File f = new File("data.txt");
            FileReader fr = new FileReader(f);
            int i;
            while ((i = fr.read()) != -1) {
                System.out.print((char) i);
            }
            fr.close();
        } catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
        }
    }
}
