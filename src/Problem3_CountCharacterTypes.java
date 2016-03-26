import java.io.*;

public class Problem3_CountCharacterTypes {
    public static void main(String[] args) {
        File fileRead = new File("words.txt");
        String sRedIn;
        String sFinal = "";

        int vowels = 0;
        int consonants = 0;
        int pMarks = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(fileRead))) {
            while ((sRedIn = br.readLine()) != null) {
                sFinal = sFinal.concat(sRedIn);
            }
        } catch (Exception ex) {
            System.out.println("Error with file reading!");
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

        File fileWrite = new File("count-chars.txt");

        try (BufferedWriter bw = new BufferedWriter( new PrintWriter(new FileWriter(fileWrite, false)))){
                bw.write(String.format("Vowels: %d%nConsonants: %d%nPunctuation: %d", vowels, consonants, pMarks));
        }catch (Exception ex){
            System.out.println("Error with file writing!");
        }

        System.out.printf("Vowels: %d\nConsonants: %d\nPunctuation: %d", vowels, consonants, pMarks);
    }
}
