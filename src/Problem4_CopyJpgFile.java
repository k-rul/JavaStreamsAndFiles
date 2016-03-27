import com.sun.xml.internal.messaging.saaj.util.ByteInputStream;

import java.io.*;

public class Problem4_CopyJpgFile {
    public static void main(String[] args) {
        File copyFile = new File("pic.jpg");
        File pasteFile = new File("my-copied- picture.jpg");
        byte[] buffer;

        try (FileInputStream copyStream = new FileInputStream(copyFile);
             FileOutputStream pasteStream = new FileOutputStream(pasteFile)) {
            buffer = new byte[(int) copyFile.length()];
            while ( copyStream.read(buffer) > 0) {
                pasteStream.write(buffer);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
