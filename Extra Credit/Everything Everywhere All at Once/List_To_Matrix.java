/**
 * Christopher Oh
 * SJSU CS 146
 * Everything, Everywhere, All at Once
 * List to Matrix
 */

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class List_To_Matrix {
    public static void main(String[] args) {

    }

    /**
     * Each node is just an int
     * @param edges arraylist of int[] of size 2, int[0] -> int[1]
     * @return matrix representation
     * row = from
     * col = to
     * So i -> j would look like matrix[i][j] = true
     */
    public static boolean[][] list_to_matrix (ArrayList<int[]> edges) {
        int nodes = num_nodes(edges);
        boolean[][] matrix = new boolean[nodes][nodes];

        for (int[] edge : edges) {
            matrix[edge[0]][edge[1]] = true;
        }

        return matrix;
    }

    /**
     * Finds how many vertices there are in an adjacency list
     * @param edges adjacency list
     * @return number of vertices
     */
    public static int num_nodes(ArrayList<int[]> edges) {
        Set<Integer> numbers = new HashSet<>();
        for (int[] edge : edges) {
            numbers.add(edge[0]);
            numbers.add(edge[1]);
        }
        return numbers.size();
    }
}
