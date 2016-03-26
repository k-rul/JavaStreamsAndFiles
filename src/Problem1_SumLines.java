import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Problem1_SumLines {
    public static void main(String[] args) {
        File file = new File("lines.txt");
        String sRead;

        try (BufferedReader bR = new BufferedReader(new FileReader(file))) {
            while ((sRead = bR.readLine()) != null) {
                System.out.println(sumSymbols(sRead));
            }
        } catch (Exception ex) {
            System.out.println("Error with file reading!");
        }
    }

    private static int sumSymbols(String str) {
        int sum = 0;
        for (char ch : str.toCharArray()) {
            sum += (int) ch;
        }
        return sum;
    }
}
