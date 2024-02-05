/**
 * Christopher Oh
 * CS 146
 * Lab 1 - two sum
 * Java
 */

import java.util.HashMap;

public class Lab1 {
    /**
     * Finds the indices of two numbers in array nums that add up to target
     *
     * assumes that each input has EXACTLY one solution
     * may not use the same element twice
     *
     * @param nums array of integers
     * @param target sum
     * @return array of size 2 of indices
     */
    public static int[] twoSum (int[] nums, int target) {
        int[] answer = new int[2];
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        /*
        put array into hashmap
        key = integer value
        value = index
         */
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        for (Integer key : map.keySet()) {
            if (map.containsKey(target - key) && key != target - key) {
                answer[0] = map.get(key);
                answer[1] = map.get(target - key);
                return answer;
            }
        }

        System.out.println("No valid answer was found");
        return answer;
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 7, 9};
        int[] ans = twoSum(nums, 5);
        System.out.println("Index: " + ans[0] + ", Value: " + nums[ans[0]]);
        System.out.println("Index: " + ans[1] + ", Value: " + nums[ans[1]]);
    }
}
