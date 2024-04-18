import java.util.Arrays;

public class Solution {
    public int findTheCity(int n, int[][] edges, int distanceThreshold) {
        int[][] matrix = new int[n][n];
        for (int[] row : matrix) {
            Arrays.fill(row, 10001);
        }
        for (int[] edge : edges) {
            matrix[edge[0]][edge[1]] = edge[2];
            matrix[edge[1]][edge[0]] = edge[2];
        }
        for (int i = 0; i < n; i++) {
            matrix[i][i] = 0;
        }

        //finding shortest path from each city to every other city
        for (int a = 0; a < n; a++) {
            for (int b = 0; b < n; b++) {
                for (int c = 0; c < n; c++) {
                    if (matrix[b][c] > matrix[b][a] + matrix[a][c]) {
                        matrix[b][c] = matrix[b][a] + matrix[a][c];
                    }
                }
            }
        }

        int city = 0; //our answer
        int smallestCount = n;

        for (int r = 0; r < n; r++) {
            int count = 0;
            for (int c = 0; c < n; c++) {
                if (matrix[r][c] <= distanceThreshold) count++;
            }
            if (count <= smallestCount) {
                city = r;
                smallestCount = count;
            }
        }

        return city;
    }
}