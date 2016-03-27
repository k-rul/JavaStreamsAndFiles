import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Problem5_SaveAnArrayListOfDoubles {
    public static void main(String[] args) {
        File file = new File("doubles.list");

        List<Double> toSave = new ArrayList<Double>();
        toSave.add(123.123);
        toSave.add(456.789);
        toSave.add(1234.5678);
        toSave.add(987.654);
        toSave.add(1357.2246808);

        List<Double> toRead = new ArrayList<Double>();

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
             ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {

            oos.writeObject(toSave);

            toRead = (List<Double>) ois.readObject();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        if (!toRead.isEmpty()){
            for (Double aDouble : toRead) {
                System.out.println(aDouble + " ");
            }
        }
    }
}
