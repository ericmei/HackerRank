import java.io.*;
import java.util.*;

public class TheLoveLetterMystery {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numWords = scanner.nextInt();
        scanner.nextLine();
        for (int i  = 0;  i < numWords; i++){
            int counter = 0;
            char[] wordLetters = (scanner.nextLine()).toCharArray();
            for (int j = 0; j < wordLetters.length/2; j++){
                if (wordLetters[j] != wordLetters[wordLetters.length - j - 1]){
                    counter += Math.abs((int)wordLetters[j] - (int)wordLetters[wordLetters.length - j - 1]);
                }
            }
            System.out.println(counter);
        }
    }
}
