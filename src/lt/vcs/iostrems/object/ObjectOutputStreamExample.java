package lt.vcs.iostrems.object;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamExample {
    public static void main(String[] args) {
        try (
                ObjectOutputStream out =
                        new ObjectOutputStream(new FileOutputStream("humans.txt"))
        ) {
            Human human = new Human("John", "Doe", 23);
            out.writeObject(human);
            Human human2 = new Human("Peter", "Go", 21);
            out.writeObject(human2);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
