package twoSum;

import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> numbers = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int addition = target - nums[i];
            if (numbers.containsKey(addition)) {
                return new int[] { numbers.get(addition), i };
            }
            numbers.put(nums[i], i);
        }
        return new int[] {};
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        // Create a testcase.
        int[] nums = { 2, 7, 11, 15 };
        int target = 9;
        int[] result = solution.twoSum(nums, target);
        System.out.println("[" + result[0] + ", " + result[1] + "]");
    }
}