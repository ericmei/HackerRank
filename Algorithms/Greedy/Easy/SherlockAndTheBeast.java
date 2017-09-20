import java.io.*;
import java.util.*;

public class SherlockAndTheBeast {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int totalDecentNum = scanner.nextInt();

        for (int numDecent = 0; numDecent < totalDecentNum; numDecent++) {
            System.out.println(findDecentNum(scanner.nextInt()));
        }
    }

    public static String findDecentNum(int numberLength) {

        int numFives = numberLength;

        while (numFives % 3 != 0) {
            if (numFives % 3 == 1) {
                numFives -= 10;
            }

            else {
                numFives -= 5;
            }
        }

        if (numFives < 0) {
            return "-1";
        }

        String fives = String.join("", Collections.nCopies(numFives, "5"));
        String threes = String.join("", Collections.nCopies(numberLength- numFives, "3"));
        String decentNumber = fives + threes;

        return decentNumber;
    }
}
