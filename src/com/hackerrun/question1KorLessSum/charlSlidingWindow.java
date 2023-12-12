package com.hackerrun.question1KorLessSum;

public class charlSlidingWindow {
	public static int maxSum(int[] nums, int k){
		int maxSum=Integer.MIN_VALUE;
		final int n = nums.length;
		for(int windowSize=1;windowSize<=k;windowSize++){
			int windowSum=0;
			for(int i=0;i<windowSize;i++){
				windowSum+=nums[i];
			}
			maxSum = Math.max(maxSum,windowSum);
			for(int j=windowSize; j<n;j++){
				windowSum+=nums[j]-nums[j-windowSize];
				maxSum = Math.max(maxSum,windowSum);
			}
		}
		return maxSum;
	}
	public static void main(String[] args){
		int[] nums={6400, -400, 200, 60, -13, 140, 1500};
		int k = 4;
		int answer = maxSum(nums,k);
		System.out.println(answer);
	}
}
