import java.io.*;
import java.util.*;

public class SimpleTextEditor {

    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int totalNumInstructions = Integer.parseInt(scanner.nextLine().trim());
            Deque<String> textHistory = new ArrayDeque<>();
            StringBuilder currentText = new StringBuilder();

            for (int numInstruction = 0; numInstruction < totalNumInstructions; numInstruction++) {
                int currentInstruction = scanner.nextInt();
                switch(currentInstruction) {
                    case 1:
                        String wordToAppend = scanner.nextLine().trim();
                        textHistory.add(currentText.toString());
                        currentText.append(wordToAppend);
                        break;
                    case 2:
                        int numCharToDelete =  scanner.nextInt();
                        textHistory.add(currentText.toString());
                        currentText.setLength(currentText.length() -numCharToDelete);
                        break;
                    case 3:
                        int charIndex = scanner.nextInt();
                        System.out.println(currentText.charAt(charIndex - 1));
                        break;
                    case 4:
                        currentText.setLength(0); //delete the current string
                        currentText.append(textHistory.pollLast());
                        break;
                    default:    //Should not hit here
                        break;
                }
            }
    }
}
