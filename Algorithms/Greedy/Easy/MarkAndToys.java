import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MarkAndToys {

    static int maximumToys(int[] prices, int k) {

        Arrays.sort(prices);
        int numToysAfforded = 0;

        for(int price : prices) {
            if (k < 0) {
                return numToysAfforded - 1; //you couldnt afford the toy that made you go under $0
            }

            k -= price;
            numToysAfforded++;
        }

        return numToysAfforded;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] prices = new int[n];
        for(int prices_i = 0; prices_i < n; prices_i++){
            prices[prices_i] = in.nextInt();
        }
        int result = maximumToys(prices, k);
        System.out.println(result);
        in.close();
    }
}
