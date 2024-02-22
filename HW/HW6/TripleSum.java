import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/**
 * Christopher Oh
 * SJSU CS 146
 * Homework 6
 */

public class TripleSum {
    public TripleSum () {}

    public List<List<Integer>> threeSum (int[] nums) {
        if (nums.length < 3 || nums.length > 3000) {
            System.out.println("Invalid array size");
            return new ArrayList<>();
        }
        List<List<Integer>> triplets = new ArrayList<>(); //triplets to be returned
        ArrayList<Integer> temp;

        HashSet<ArrayList<Integer>> tripletsSet = new HashSet<>(); //HashSet prevents duplicate triplets

        Arrays.sort(nums);

        for (int a = 0; a < nums.length - 2; a++) {
            for (int b = a + 1; b < nums.length - 1; b++) {
                int third = -(nums[a] + nums[b]);
                int index = binarySearch(nums, third, b + 1, nums.length - 1);
                if (index > 0) {
                    temp = new ArrayList<>();
                    temp.add(nums[a]);
                    temp.add(nums[b]);
                    temp.add(third);
                    tripletsSet.add(temp);
                }
            }
        }

        for (ArrayList<Integer> set : tripletsSet) {
            ArrayList<Integer> trioList = new ArrayList<>(set);
            triplets.add(trioList);
        }

        return triplets;
    }

    private int binarySearch (int[] nums, int target, int low, int high) {
        int index = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] > target) {
                high = mid - 1;
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                index = mid;
                break;
            }
        }
        return index;
    }
}
