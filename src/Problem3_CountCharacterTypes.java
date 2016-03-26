import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Problem3_CountCharacterTypes {
    public static void main(String[] args) {
        File file = new File("words.txt");
        String sRedIn;
        String sFinal = "";

        int vowels = 0;
        int consonants = 0;
        int pMarks = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            while ((sRedIn = br.readLine()) != null) {
                sFinal = sFinal.concat(sRedIn);
            }
        } catch (Exception ex) {
            System.out.println("Error with file writing!");
        }

        for (char c : sFinal.toCharArray()) {
            switch (c) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    vowels++;
                    break;
                case '!':
                case ',':
                case '.':
                case '?':
                    pMarks++;
                    break;
                case ' ':
                    break;
                default:
                    consonants++;
                    break;
            }
        }
        System.out.printf("Vowels: %d\nConsonants: %d\nPunctuation: %d", vowels, consonants, pMarks);
    }
}
