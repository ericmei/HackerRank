import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class HackerlandRadioTransmitters {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] x = new int[n];
        for(int x_i=0; x_i < n; x_i++){
            x[x_i] = in.nextInt();
        }

        Arrays.sort(x);

        int numTransmitters = 0;
        int currentHouseIndex = 0;

        //find location of where transmitter needs to be
        while(currentHouseIndex < n) {

            numTransmitters++;

            //this is the furthest location you can go from the
            int location = x[currentHouseIndex] + k;

            //increment until you hit the house right after where the transmitter belongs
            while (currentHouseIndex < n && x[currentHouseIndex] <= location) {
                currentHouseIndex++;
            }

            //this is the furthest the transmitter can be from the house where the router can be
            location = x[currentHouseIndex - 1] + k;

            while (currentHouseIndex < n && x[currentHouseIndex] <= location) {
                currentHouseIndex++;
            }

        }

        System.out.println(numTransmitters);


    }

}
