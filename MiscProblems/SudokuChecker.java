import java.util.Arrays;

public class Solution {
      public static void main(String args[]) {

        int[][] sudokuMatrix={

                {5,3,4,6,7,8,9,1,2},
                {6,7,2,1,9,5,3,4,8},
                {1,9,8,3,4,2,5,6,7},
                {8,5,9,7,6,1,4,2,3},
                {4,2,6,8,5,3,7,9,1},
                {7,1,3,9,2,4,8,5,6},
                {9,6,1,5,3,7,2,8,4},
                {2,8,7,4,1,9,6,3,5},
                {3,4,5,2,8,6,1,7,9}
            };

        System.out.println(SudokuChecker.checkSudokuStatus(sudokuMatrix));
    }
}


class SudokuChecker {

    //sudokuMatrix[row][column]

    public static boolean checkSudokuStatus(int[][] sudoku) {
        for (int rowIndex = 0; rowIndex < 9; rowIndex++) {

            int[] column = new int[9];
            int[] row = Arrays.copyOf(sudoku[rowIndex], 9);
            int[] square = new int[9];

            for (int columnIndex = 0; columnIndex < 9; columnIndex++) {
                column[columnIndex] = sudoku[rowIndex][columnIndex];
                square[columnIndex] = sudoku[rowIndex * 3 % 9 + columnIndex % 3][(rowIndex / 3) * 3 + columnIndex / 3];
            }

            for (int elem: square) {
                System.out.println(elem);
            }
            System.out.println();

            if (!(validate(column) && validate(row) && validate(square))) {
                return false;
            }
        }

        return true;
    }

    private static boolean validate(int[] check) {

        Arrays.sort(check);

        for (int number = 1; number <= check.length; number++) {
            if (number != check[number - 1])
                return false;
        }
        return true;
    }

}
