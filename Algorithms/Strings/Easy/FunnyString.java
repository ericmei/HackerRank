import java.io.*;
import java.util.*;
import java.lang.*;

public class FunnyString {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int totalTests = Integer.parseInt(s.nextLine());

        outerloop:
        for (int i = 0; i < totalTests; i++){
            String input = s.nextLine();
            for (int j= 1; j < input.length(); j++){

            if ( Math.abs(input.charAt(j) - input.charAt(j-1)) != Math.abs(input.charAt(input.length()-j) -input.charAt(input.length() - j -1))){

                System.out.println("Not Funny");
                continue outerloop;
                }
            }
            System.out.println("Funny");
        }
    }
}
