package com.ajeya;

import java.util.HashMap;

public class TwoSum {
    /**
     * Given an array of integers, return indices of the two numbers such that they add up to a specific target
     * Given nums = [2, 7, 11, 15], target = 9,
     *
     * Because nums[0] + nums[1] = 2 + 7 = 9,
     * return [0, 1].
     */
    int[] sum(int[] nums, int target) {
        int arrayLength = nums.length;
//        return index as -1 and -1 if no suitable results are found
        int index1 = -1;
        int index2 = -1;
        if (arrayLength > 0) {
            HashMap<Integer, Integer> table = new HashMap<>();
            int index, j;
            for (index = 0; index < arrayLength; index++) {
                table.put(nums[index], index);
            }
            for (j = 0; j < arrayLength; j++) {
                Integer diff = target - nums[j];
//                If target is zero it always returns same index
                if (table.containsKey(diff) && table.get(diff) != j) {
                    index1 = table.get(diff);
                    index2 = j;
                    break;
                }
            }
        }
        return (new int[]{index1, index2});
    }
}
