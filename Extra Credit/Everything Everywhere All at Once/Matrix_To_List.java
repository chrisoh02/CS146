/**
 * Christopher Oh
 * SJSU CS 146
 * Everything, Everywhere, All at Once
 * Matrix To List
 */

import java.util.ArrayList;

public class Matrix_To_List {
    public static void main(String[] args) {

    }

    /**
     * Takes a boolean matrix where row is starting vertex and col is ending vertex of edges
     * Note: Matrix will always have same number of rows and columns
     * @param matrix
     * @return
     */
    public static ArrayList<int[]> matrix_to_list (boolean[][] matrix) {
        ArrayList<int[]> list = new ArrayList<>();

        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[0].length; c++) {
                if (matrix[r][c]) {
                    int[] temp = {r, c};
                    list.add(temp);
                }
            }
        }

        return list;
    }
}
