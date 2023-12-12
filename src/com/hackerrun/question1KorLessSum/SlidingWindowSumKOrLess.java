package com.hackerrun.question1KorLessSum;


public class SlidingWindowSumKOrLess {

    public static int maxSum(int[] nums, int k) {
        int n = nums.length;
        int maxSum = Integer.MIN_VALUE;

        // Try each window size from 1 to k
        for (int windowSize = 1; windowSize <= k; windowSize++) {
            int windowSum = 0;

            // Calculate the sum of the first window
            for (int i = 0; i < windowSize; i++) {
                windowSum += nums[i];
            }

            maxSum = Math.max(maxSum, windowSum);

            // Slide the window and update the sum
            for (int i = windowSize; i < n; i++) {
                windowSum += nums[i] - nums[i - windowSize];
                maxSum = Math.max(maxSum, windowSum);
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] nums = {-6400, -400, -200, 6000, -13, -140, -1500};
        int k = 4;
        int answer = maxSum(nums, k);
        System.out.println(answer);
    }
}
 
