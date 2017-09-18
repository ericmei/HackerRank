import java.io.*;
import java.util.*;

public class SuperReducedString {

    public static void main(String[] args) {        
        Scanner in = new Scanner(System.in);
        StringBuilder input = new StringBuilder(in.nextLine());

        for (int i = 0; i < input.length() -1; i++){
            if (input.charAt(i) == input.charAt(i+1)){
                input.delete(i, i+2);
                if (input.length() == 0){
                    System.out.println("Empty String");
                    break;
                }

                i = (i==0) ? -1 : i - 2;
            }
        }
       System.out.println(input);
    }
}
