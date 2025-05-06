package src;

import java.io.*;

public class BufferedReaderExample {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        System.out.println("Type lines (type 'STOP' to end):");

        while (true) {
            line = br.readLine();
            if (line.equals("STOP")) break;
            System.out.println("You typed: " + line);
        }
    }
}

