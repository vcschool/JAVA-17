package lt.vcs.iostrems.file;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamExample {
    public static void main(String[] args) {
        try (
                FileInputStream in = new FileInputStream("input-output-stream.txt")
        ) {
            int data;
            char character;
            while ((data = in.read()) != -1) {
                character = (char) data;
                System.out.print(character);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
