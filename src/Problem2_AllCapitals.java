import com.sun.xml.internal.bind.v2.runtime.reflect.Lister;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Problem2_AllCapitals {
    public static void main(String[] args) {
        File file = new File("lines2.txt");
        String sRead;
        List<String> ls = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            while ((sRead = br.readLine()) != null) {
                ls.add(sRead.toUpperCase()+ "\r\n");
                System.out.println(sRead.toUpperCase());
            }
        } catch (Exception ex) {
            System.out.println("Error with file reading!");
        }

        try (BufferedWriter bw = new BufferedWriter( new PrintWriter(new FileWriter(file, false)))){
            for (String l : ls) {
                bw.write(l);
            }
        }catch (Exception ex){
            System.out.println("Error with file writing!");
        }
    }
}