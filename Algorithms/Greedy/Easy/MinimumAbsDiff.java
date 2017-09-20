import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MinimumAbsDiff {

    static int minimumAbsoluteDifference(int n, int[] arr) {
        Arrays.sort(arr);

        int min = Integer.MAX_VALUE;
        for (int valueIndex = 1; valueIndex < arr.length; valueIndex++) {

            int currentAbsDiff = Math.abs(arr[valueIndex] - arr[valueIndex - 1]);

            if (currentAbsDiff < min) {
                min = currentAbsDiff;
            }
        }

        return min;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        int result = minimumAbsoluteDifference(n, arr);
        System.out.println(result);
        in.close();
    }
}
