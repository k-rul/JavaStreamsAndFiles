import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Problem6_SaveACustomObjectInFile {
    public static void main(String[] args) {
        File file = new File("custom.obj");

        Problem6CustomObject toSave = new Problem6CustomObject(1234.5678, 500000);
        Problem6CustomObject toRead;

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
             ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {

            oos.writeObject(toSave);

            toRead = (Problem6CustomObject) ois.readObject();

            System.out.println(String.format("%f\n%d", toRead.GetFirstVar(), toRead.GetSecondVar()));
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}

