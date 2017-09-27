import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TaumAndBday {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            long b = in.nextLong();
            long w = in.nextLong();
            long x = in.nextLong();
            long y = in.nextLong();
            long z = in.nextLong();

            long totalMinCost = b * x + w * y;

            if (x < y) {
                if (x + z < y) {
                    totalMinCost = b * x + w * (x + z);
                }
            }

            else if (y < x) {
                 if (y + z < x) {
                    totalMinCost = b * (y + z) + w * y;
                }
            }

            System.out.println(totalMinCost);
        }
    }
}
