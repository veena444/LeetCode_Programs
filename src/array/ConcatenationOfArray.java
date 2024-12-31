package array;

import java.util.Arrays;

/*
 * Given an integer array nums of length n, you want to create an array ans of length 2n where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).

Specifically, ans is the concatenation of two nums arrays.

Return the array ans.

Example 1:

Input: nums = [1,2,1]
Output: [1,2,1,1,2,1]
Explanation: The array ans is formed as follows:
- ans = [nums[0],nums[1],nums[2],nums[0],nums[1],nums[2]]
- ans = [1,2,1,1,2,1]
Example 2:

Input: nums = [1,3,2,1]
Output: [1,3,2,1,1,3,2,1]
Explanation: The array ans is formed as follows:
- ans = [nums[0],nums[1],nums[2],nums[3],nums[0],nums[1],nums[2],nums[3]]
- ans = [1,3,2,1,1,3,2,1]
 */
public class ConcatenationOfArray {

	public static void main(String[] args) {
		int[] nums = {1,2,1};
		System.out.println(Arrays.toString(getConcatenation(nums)));

	}
	
    public static int[] getConcatenation(int[] nums) {
    	//get the length of the array
    	int n = nums.length;
    	//create new array that is twice the length of the input array
    	int[] result = new int[n*2];
    	//loop through the new array to fill it with elements from the input array
    	for(int i=0;i<n*2;i++) {
            // Since we are concatenating the input array with itself,
            // we use the modulo operator to wrap around the index for array 'nums'
            // This is because 'nums' has a length of 'n' and 'result' has a length of 'n * 2'
            // Therefore, when 'i' is greater than or equal to 'n', 
            // 'i % n' will start from 0 again, essentially repeating the array 'nums'
    		result[i] = nums[i % n];
    	}
		return result;
        
    }

}
