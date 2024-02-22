import java.util.ArrayList;
import java.util.Arrays;
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
            return null;
        }
        List<List<Integer>> triplets = new ArrayList<>(); //triplets to be returned
        ArrayList<Integer> temp;

        Arrays.sort(nums);

        for (int a = 0; a < nums.length - 2; a++) {
            for (int b = a + 1; b < nums.length; b++) {
                int third = -(nums[a] + nums[b]);
                int index = binarySearch(nums, third, b + 1, nums.length - 1);
                if (index > 0) {
                    do {
                        temp = new ArrayList<>();
                        temp.add(nums[a]);
                        temp.add(nums[b]);
                        temp.add(third);
                        triplets.add(temp);
                        index++;
                    } while (index < nums.length - 1 && nums[index] == nums[index + 1]);
                }
            }
        }

        return triplets;
    }

    /**
     * Finds the lowest index of a target
     * Array might have duplicate values, so find the lowest index with that value
     * ex) searching for 5 in [0, 1, 5, 5, 5, 8] returns 2
     * @param nums
     * @param target
     * @param low
     * @param high
     * @return lowest index with target value
     */
    private int binarySearch (int[] nums, int target, int low, int high) {
        int index = -1;
        int lowest = low;
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
        if (index < 0) return index;

        while (index > lowest && nums[index - 1] == nums[index]) {
            index--;
        }

        return index;
    }
}
