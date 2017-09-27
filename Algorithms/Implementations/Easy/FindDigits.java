import java.io.*;
import java.util.*;

public class FindDigits {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int totalNumInputs = scanner.nextInt();

        for (int numInput = 0; numInput < totalNumInputs; numInput++) {

            int currentInput = scanner.nextInt();
            int workingNum = currentInput;
            int numEvenlyDivisible = 0;

            while (workingNum > 0) {
                int digit = workingNum % 10;

                if (digit != 0) {
                    if (currentInput % digit == 0) {
                       numEvenlyDivisible++;
                    }
                }

                workingNum = workingNum / 10;
            }

            System.out.println(numEvenlyDivisible);
        }
    }
}
