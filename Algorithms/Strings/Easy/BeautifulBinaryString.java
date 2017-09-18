import java.io.*;
import java.util.*;

public class BeautifulBinaryString {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int strLen = in.nextInt();
        StringBuilder inputStr = new StringBuilder(in.next());

        int counter = 0;
        for (int i = 0 ; i < inputStr.length() - 2; i++) {
            if ((inputStr.substring(i, i+ 3)).equals("010")) {
                counter++;
                i += 2;
            }
        }
        System.out.println(counter);
    }
}
