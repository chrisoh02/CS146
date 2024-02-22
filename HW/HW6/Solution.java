import java.util.*;

public class Solution {
    public Solution() {}
    public List<List<Integer>> threeSum (int[] nums) {
        List<List<Integer>> answer = new ArrayList<>(); //list of all valid triplets
        if (nums.length < 3 || nums.length > 3000) {
            System.out.println("Invalid array size");
            return answer;
        }
        HashSet<ArrayList<Integer>> triplets = new HashSet<>();
        HashMap<Integer, Integer> vi = new HashMap<>(); //value index pairs of all elements in nums
        ArrayList<int[]> uniquePairs = new ArrayList<>(); //unique pairs


        //put all elements into vi
        //put all unique pairs into "pairs"
        for (int i = 0; i < nums.length; i++) {
            vi.put(nums[i], i);
            for (int j = i + 1; j < nums.length; j++) {
                int[] tempArr = {i, j};
                uniquePairs.add(tempArr);
            }
        }

        for (int[] duo : uniquePairs) {
            int third = -(nums[duo[0]] + nums[duo[1]]);
            if (vi.containsKey(third) && vi.get(third) != duo[0] && vi.get(third) != duo[1]) {
                ArrayList<Integer> temp = new ArrayList<>();
                temp.add(nums[duo[0]]);
                temp.add(nums[duo[1]]);
                temp.add(third);
                Collections.sort(temp);
                triplets.add(temp);
            }
        }

        
        for (ArrayList<Integer> set : triplets) {
            ArrayList<Integer> trioList = new ArrayList<>(set);
            triplets.add(trioList);
        }

        return answer;
    }
}
