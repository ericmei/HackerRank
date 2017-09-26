import java.io.*;
import java.util.*;

public class Encryption {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String originalSentence = scanner.nextLine();

        int numRows = (int) Math.ceil(Math.sqrt(originalSentence.length()));
        int numColumns = (int) Math.ceil(Math.sqrt(originalSentence.length()));

        for (int columnIndex = 0; columnIndex < numColumns; columnIndex++) {
            for (int rowIndex = 0; rowIndex < numRows; rowIndex++) {
                int currentLetterIndex = columnIndex + rowIndex * numColumns;

                if (currentLetterIndex < originalSentence.length()) {
                    System.out.print(originalSentence.charAt(currentLetterIndex));
                }
            }

            System.out.print(" ");
        }

    }
}
