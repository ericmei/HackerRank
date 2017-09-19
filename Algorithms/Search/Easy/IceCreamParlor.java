import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class IceCreamParlor {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int totalTrips = in.nextInt();
        for (int i = 0; i < totalTrips; i++){
            int budget = in.nextInt();
            int numFlavors = in.nextInt();
            HashMap<Integer, Integer> seen = new HashMap<Integer, Integer>();

            innerLoop:
            for (int j = 1; j <= numFlavors; j++){
                int nextCost = in.nextInt();
                if (seen.containsKey(budget - nextCost)){
                    if (j < seen.get(budget - nextCost)){

                        System.out.printf("%d %d%n", j, seen.get(budget-nextCost));
                    }

                    else{
                        System.out.printf("%d %d%n", seen.get(budget-nextCost), j);
                    }
                    in.nextLine();
                    break innerLoop;
                }

                else{
                    seen.put(nextCost, j);
                }
            }
        }
    }
}
