import java.util.ArrayList;
import java.util.Collections;

public class Solution3 {
    public int minCostToSupplyWater(int n, int[] wells, int[][] pipes) {
        ArrayList<int[]> mst = kruskal(n, wells, pipes);
        return mstCost(mst);
    }

    private ArrayList<int[]> kruskal (int n, int[] wells, int[][] pipes) {
        ArrayList<int[]> mst = new ArrayList<>();
        ArrayList<int[]> edges = new ArrayList<>();

        for (int[] row : pipes) {
            edges.add(row);
        }
        /**
         * Connecting the houses to a placeholder house of index n
         * The weight of the edge from house A to placeholder is the cost of the well of house A
         */
        for (int i = 0; i < wells.length; i++) {
            int[] temp = {n, i, wells[i]};
            edges.add(temp);
        }

        //sort the edges by weight
        Collections.sort(edges, (e1, e2) -> Integer.compare(e1[2], e1[2]));

        boolean[] visited = new boolean[n + 1];

        while (mst.size() < n) {
            for (int i = 0; i < edges.size(); i++) {
                //checking for cycle
                if (!(visited[edges.get(i)[0]] && visited[edges.get(i)[1]])) {
                    mst.add(edges.get(i));
                    visited[edges.get(i)[0]] = true;
                    visited[edges.get(i)[1]] = true;
                    edges.remove(i);
                    break;
                }
            }
        }

        return mst;
    }

    private int mstCost (ArrayList<int[]> mst) {
        int cost = 0;
        for (int[] edge : mst) {
            cost += edge[2];
        }
        return cost;
    }
}
