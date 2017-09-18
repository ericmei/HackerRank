import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TwoStrings {

    static String twoStrings(String s1, String s2){

        Set<Character> s1Letters = new HashSet<>();
        for(char letter : s1.toCharArray()) {
           s1Letters.add(letter);
        }

        for(char letter : s2.toCharArray()) {
            if (s1Letters.contains(letter)) {
                return "YES";
            }
        }

        return "NO";
        /*
        Map<Character, Boolean> letters = new HashMap<Character, Boolean>();
        for(char letter : s1.toCharArray()) {
            if (!letters.containsKey(letter)) {
                letters.put(letter, true);
            }
        }

        for(char letter : s2.toCharArray()) {
            if (letters.containsKey(letter)) {
                return "YES";
            }
        }

        return "NO";
        */
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s1 = in.next();
            String s2 = in.next();
            String result = twoStrings(s1, s2);
            System.out.println(result);
        }
    }
}
