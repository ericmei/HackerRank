import java.io.*;
import java.util.*;

public class LuckBalance {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner scanner = new Scanner(System.in);
        int totalNumContests = scanner.nextInt();
        int maxContestsToLose = scanner.nextInt();

        int totalLuck = 0;
        int totalNumImportantContests = 0;
        PriorityQueue allImportantContests = new PriorityQueue();

        for (int numContest = 0; numContest < totalNumContests; numContest++) {
            int contestLuck = scanner.nextInt();
            int contestImportance = scanner.nextInt();

            if (contestImportance == 0) {
                totalLuck += contestLuck;
            }

            else {
                allImportantContests.add(contestLuck);
                totalNumImportantContests += 1;
            }

        }

        int totalNumImportantContestsToLose = totalNumImportantContests - maxContestsToLose;

        while (totalNumImportantContestsToLose > 0) {

            totalLuck -= (int)allImportantContests.poll();
            totalNumImportantContestsToLose--;
        }

        while (allImportantContests.peek() != null) {

            totalLuck += (int)allImportantContests.poll();

        }

        System.out.println(totalLuck);
    }
}
