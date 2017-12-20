package lt.vcs.iostrems.file.buffered;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class Printer {

    void copyFile(String fileName, String newFileName) {
        try {
            try (
                    BufferedReader reader = new BufferedReader(new FileReader(fileName));
                    BufferedWriter wtiter = new BufferedWriter(new FileWriter(newFileName))
            ) {
                String line;
                while ((line = reader.readLine()) != null) {
                    wtiter.write(line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



}

