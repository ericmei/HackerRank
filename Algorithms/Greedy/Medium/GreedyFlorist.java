import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import com.google.common.primitives.Ints;

public class GreedyFlorist {

    static int getMinimumCost(int totalNumFlowers, int numFriends, int[] c){

        int totalMinCost = 0;
        List<Integer> integersList = Ints.asList(c);

        Collections.sort(integersList, Collections.reverseOrder());

        for (int numFlower = 0; numFlower < c.length; numFlower++) {
            totalMinCost += c[numFlower] * (1 + numFlower / numFriends);
        }

        return totalMinCost;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] c = new int[n];
        for(int c_i=0; c_i < n; c_i++){
            c[c_i] = in.nextInt();
        }
        int minimumCost = getMinimumCost(n, k, c);
        System.out.println(minimumCost);
    }
}
