import java.io.*;
import java.util.*;

public class QHeap {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numInstructions = scanner.nextInt();
        PriorityQueue<Integer> heap = new PriorityQueue<>();

        for (int i = 0; i < numInstructions; i++) {

            int nextElement = scanner.nextInt();
            switch(nextElement) {
                    case 1:
                        heap.add(scanner.nextInt());
                        break;
                    case 2:
                        heap.remove(scanner.nextInt());
                        break;
                    case 3:
                        System.out.println(heap.peek());
                        break;
                    default: //default case should never happen!
                        break;
            }
        }
    }
}
