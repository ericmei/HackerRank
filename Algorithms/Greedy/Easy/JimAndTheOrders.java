import java.io.*;
import java.util.*;

public class JimAndTheOrders {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Map<Integer,Integer> totalOrderNum = new HashMap<>();

        for (int i=1;i<=n;i++){
            int time = scanner.nextInt()+scanner.nextInt();
            totalOrderNum.put(i,time);
        }

        List<Map.Entry<Integer,Integer>> list =
            new LinkedList<>(totalOrderNum.entrySet());
        Collections.sort(list, (o1,o2) -> (o1.getValue()).compareTo(o2.getValue()));

        for (Map.Entry entry : list) {
            System.out.print(entry.getKey() + " ");
        }
    }
}
