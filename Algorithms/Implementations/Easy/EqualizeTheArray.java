import java.io.*;
import java.util.*;

public class EqualizeTheArray {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();

        int max = 1;
        Map<Integer, Integer> nums = new HashMap<>();

        for (int i = 0; i < testCases; i++) {

            int nextNum = scanner.nextInt();

            if (!nums.containsKey(nextNum)) {
                nums.put(nextNum, 1);
            }

            else {
                nums.put(nextNum, nums.get(nextNum) + 1);
                if (max < nums.get(nextNum)) {
                    max = nums.get(nextNum);
                }
            }
        }

        System.out.println(testCases - max);
    }

}
