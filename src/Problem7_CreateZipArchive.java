import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class Problem7_CreateZipArchive {
    public static void main(String[] args) {
        File[] files = new File[3];
        files[0] = new File("words.txt");
        files[1] = new File("count-chars.txt");
        files[2] = new File("lines.txt");

        File zipFile = new File("text-files.zip");

        byte[] buffer;

        try (ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(zipFile))) {

            for (int i = 0; i < files.length; i++) {
                try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(files[i]))) {
                    zos.putNextEntry(new ZipEntry(files[i].getName()));
                    buffer = new byte[(int) files[i].length()];
                    bis.read(buffer);
                    zos.write(buffer);
                    zos.closeEntry();
                    bis.close();
                }
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
