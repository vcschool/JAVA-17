package lt.vcs.iostrems.file.buffered;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterExample {
    public static void main(String[] args) {
        try (
                BufferedWriter out = new BufferedWriter(new FileWriter("buffered-writer-reader.txt"))
        ) {
            out.write("Sveiki" + System.lineSeparator() + "visi");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
