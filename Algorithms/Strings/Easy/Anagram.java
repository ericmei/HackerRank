import java.io.*;
import java.util.*;

public class Anagram {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int totalCases = Integer.parseInt(in.nextLine());

        outerloop:
        for (int i = 0; i < totalCases; i++){
            int result = 0;


            char[] allChars = (in.nextLine()).toCharArray();

            if (allChars.length % 2 == 1){
                System.out.println("-1");
                continue outerloop;
            }

            char[] firstString = Arrays.copyOfRange(allChars, 0, allChars.length/2);
            char[] secondString = Arrays.copyOfRange(allChars, allChars.length/2, allChars.length);

            HashMap<Character, Integer> firstStrFrequency = new HashMap<Character, Integer>();

            for (int j = 0; j < firstString.length; j++){
                if (firstStrFrequency.containsKey(firstString[j])){
                    firstStrFrequency.put(firstString[j], firstStrFrequency.get(firstString[j]) + 1);
                }

                else{
                    firstStrFrequency.put(firstString[j], 1);
                }
            }

               for (int k = 0; k < secondString.length; k++){
                if (firstStrFrequency.containsKey(secondString[k]) && firstStrFrequency.get(secondString[k]) > 0){
                    firstStrFrequency.put(secondString[k], firstStrFrequency.get(secondString[k]) - 1);
                }

                else{
                    result++;
                }
            }
            System.out.println(result);
        }
    }
}
