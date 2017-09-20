import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MarcsCakeWalk {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] calories = new int[n];
        for(int calories_i=0; calories_i < n; calories_i++){
            calories[calories_i] = in.nextInt();
        }

        //there is no elegant way to sort and reverse a primitive array in java
        Arrays.sort(calories);

        long totalCalories = 0;

        //so here, we just go backwards and calculate the numberth cupcake by subtracting from the total length
        for (int numCupcake = calories.length - 1; numCupcake >= 0 ; numCupcake--) {


            totalCalories += calories[numCupcake] * Math.pow(2, calories.length - numCupcake - 1);
        }

        System.out.println(totalCalories);
    }
}
