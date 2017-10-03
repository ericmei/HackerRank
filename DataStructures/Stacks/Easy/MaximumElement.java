import java.io.*;
import java.util.*;

public class MaximumElement {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numSteps = scanner.nextInt();

        Stack<Integer> allAvailableNums = new Stack();
        PriorityQueue<Integer> maxNum = new PriorityQueue<>(10, Collections.reverseOrder());

        for (int numOperation = 0; numOperation < numSteps; numOperation++) {
            int operation = scanner.nextInt();

            switch (operation) {
                case(1):
                    int numToPush = scanner.nextInt();
                    allAvailableNums.push(numToPush);
                    maxNum.offer(numToPush);
                    break;
                case(2):
                    Integer poppedNum = (allAvailableNums.pop());
                    maxNum.remove(poppedNum);
                    break;
                case(3):
                    System.out.println(maxNum.peek());
                    break;
            }
        }
    }
}
