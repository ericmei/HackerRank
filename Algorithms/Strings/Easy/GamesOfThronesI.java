import java.io.*;
import java.util.*;

public class GamesOfThronesI {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        int[] allNums = new int[26];

        boolean maxOneOdd = false;
        for (int i =0; i < word.length(); i++){
            allNums[(int)(word.charAt(i)) - 97] += 1;
        }

        for (int j = 0; j <allNums.length; j++){
            if (allNums[j] % 2 == 1){
                if(word.length() %2 == 1){
                    if(maxOneOdd){
                       System.out.println("NO");
                        return;
                    }
                    else{
                        maxOneOdd = true;
                    }
                }

                else{
                    System.out.println("NO");
                        return;
                }
            }
        }

        System.out.println("YES");
    }
}
