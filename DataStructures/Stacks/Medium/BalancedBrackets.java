import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BalancedBrackets {

    static String isBalanced(String s) {
        char[] allChars = s.toCharArray();
        Stack openBraces = new Stack();
        Map<Character, Character> matchingBraces = new HashMap();
        matchingBraces.put('}', '{');
        matchingBraces.put(')', '(');
        matchingBraces.put(']', '[');

        for (char letter: allChars) {
            if (letter == '{' || letter == '[' || letter == '(') {
                openBraces.push(letter);
            }

            else {
                if (openBraces.size() == 0 || openBraces.pop() != matchingBraces.get(letter)) {
                    return "NO";
                }

            }
        }

        if (openBraces.size() == 0) {
           return "YES";
        }

        return "NO";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            String s = in.next();
            String result = isBalanced(s);
            System.out.println(result);
        }
        in.close();
    }
}
