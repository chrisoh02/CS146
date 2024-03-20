/**
 * Christopher Oh
 * SJSU CS 146
 * Everything, Everywhere, All at Once
 * Reverse Edges
 */

import java.util.ArrayList;

public class Reverse_Edges {
    public static void main(String[] args) {

    }

    /**
     * Swaps the rows and columns along the diagonal
     * @param edges
     * @return
     */
    public static boolean[][] reverse_edges (boolean[][] edges) {
        boolean[][] reverse = new boolean[edges.length][edges.length];
        for (int r = 0; r < edges.length; r++) {
            for (int c = 0; c < edges.length; c++) {
                reverse[r][c] = edges[c][r];
            }
        }
        return edges;
    }

    /**
     * Reverses the pair ordering of every edge
     * @param edges
     * @return
     */
    public static ArrayList<int[]> reverse_edges (ArrayList<int[]> edges) {
        ArrayList<int[]> reverse = new ArrayList<>();
        for (int[] edge : edges) {
            int[] temp = {edge[1], edge[0]};
            reverse.add(temp);
        }
        return reverse;
    }

}
