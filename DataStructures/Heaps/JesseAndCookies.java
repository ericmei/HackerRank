import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        PriorityQueue<Integer> sugarLevels = new PriorityQueue<Integer>();
        int numCookies = input.nextInt();
        int sweetnessLevel = input.nextInt();
        int counter = 0;

        for (int i = 0; i < numCookies; i++){
            sugarLevels.add(input.nextInt());
        }


        while (sugarLevels.peek() < sweetnessLevel){
            if (sugarLevels.size() < 2){
                System.out.println(-1);
                return;
            }

            int newCookie = sugarLevels.poll() + (2* sugarLevels.poll());
            sugarLevels.offer(newCookie);
            counter++;
        }

        System.out.println(counter);
    }
}
