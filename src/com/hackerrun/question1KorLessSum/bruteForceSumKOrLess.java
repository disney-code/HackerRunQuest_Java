package com.hackerrun.question1KorLessSum;
// j and i are the index into the array
public class bruteForceSumKOrLess {
	public static int maxSum(int[] nums, int k){
		int n = nums.length;
		System.out.println("There are "+n+" items");
		int maxValue=Integer.MIN_VALUE;
		for(int i=0;i<n;i++){
			int current_sum=0;
			for(int j=i;j<=i+k-1 &j<n;j++){
				
					current_sum+=nums[j];
					maxValue=Math.max(current_sum, maxValue);
				
			}
		}
		return maxValue;
	}

	public static void main(String[] args) {
		int[] nums={6400,400,200,60,-13,140,1500};
		int k = 4;
		int answer=maxSum(nums,  k);
		System.out.println(answer);
	}
	
	
}
