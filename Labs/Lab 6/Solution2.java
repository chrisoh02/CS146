import java.util.HashSet;

public class Solution2 {
    public Solution2 () {}

    public boolean canFinish (int numCourses, int[][] prerequisites) {
        HashSet<Integer>[] prereqs = new HashSet[numCourses];
        for (int i = 0; i < numCourses; i++) {
            prereqs[i] = new HashSet<>();
        }


        for (int[] pair : prerequisites) {
            prereqs[pair[0]].add(pair[1]);
        }

        boolean[] visited = new boolean[numCourses];

        for (int i = 0; i < numCourses; i++) {
            if (!dfs(i, prereqs, visited)) return false;
        }

        return true;
    }

    private boolean dfs(int course, HashSet<Integer>[] prereqs, boolean[] visited) {
        if (visited[course]) return false;
        visited[course] = true;

        for (Integer i : prereqs[course]) {
            if (!dfs(i, prereqs, visited)) return false;
        }

        visited[course] = false;
        return true;
    }
}
