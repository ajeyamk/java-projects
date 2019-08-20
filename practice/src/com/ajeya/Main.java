package com.ajeya;

import java.util.Arrays;

public class Main {
    private static int target = -8;
    private static int[] nums = {-1,-2,-3,-4,-5};
    public static void main(String[] args ) {
        TwoSum sol = new TwoSum();
        int[] indices = sol.sum(nums, target);
        System.out.println(Arrays.toString(indices));
    }
}

