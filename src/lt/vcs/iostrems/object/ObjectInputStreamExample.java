package lt.vcs.iostrems.object;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectInputStreamExample {
    public static void main(String[] args) {
        try (
                ObjectInputStream in = new ObjectInputStream(new FileInputStream("humans.txt"))
        ) {
            System.out.println(in.readObject());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
