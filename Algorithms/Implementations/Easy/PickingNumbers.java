import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class PickingNumbers {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }

        Arrays.sort(a);

        int maxSetSize = 0;
        int currentSetMaxSize = 0;
        int currentReferenceInt = Integer.MIN_VALUE;

        for (int num: a) {
            if (currentReferenceInt + 1 < num) {
                currentReferenceInt = num;

                if (currentSetMaxSize > maxSetSize) {
                    maxSetSize = currentSetMaxSize;
                }

                currentSetMaxSize = 1;
            }

            else {
                currentSetMaxSize += 1;
            }
        }

        if (currentSetMaxSize > maxSetSize) {
            maxSetSize = currentSetMaxSize;
        }

        System.out.println(maxSetSize);
    }
}
