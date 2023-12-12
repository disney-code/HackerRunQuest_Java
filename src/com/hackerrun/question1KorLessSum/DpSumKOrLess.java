package com.hackerrun.question1KorLessSum;

public class DpSumKOrLess {
	public static int maxSum(int[] nums, int k) {
		int n = nums.length;
		int[] dp = new int[n];
		dp[0] = nums[0];
		int currentSum = nums[0];
	
		// Initialize the DP array
		for (int i = 1; i < Math.min(k, n); i++) {
		    currentSum += nums[i];
		    dp[i] = currentSum;
		}
	
		// Apply DP with a sliding window for sum calculation
		for (int i = k; i < n; i++) {
		    currentSum += nums[i] - nums[i - k];
		    dp[i] = Math.max(dp[i - 1], currentSum);
		}
	
		// Find the maximum value in the DP array
		int maxSum = Integer.MIN_VALUE;
		for (int sum : dp) {
		    maxSum = Math.max(maxSum, sum);
		}
	
		return maxSum;
	    }
	
	    public static void main(String[] args) {
		int[] nums={-6400, -400, -200, 6000, -13, -140, -1500};
		int k = 4;
		int answer = maxSum(nums, k);
		System.out.println(answer);
	    }
}
