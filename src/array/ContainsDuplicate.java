package array;

import java.util.HashMap;

/*
 * Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
 * 
 * Example 1:

Input: nums = [1,2,3,1]

Output: true

Explanation:

The element 1 occurs at the indices 0 and 3.

Example 2:

Input: nums = [1,2,3,4]

Output: false

Explanation:

All elements are distinct.

Example 3:

Input: nums = [1,1,1,3,3,4,3,2,4,2]

Output: true
 */
public class ContainsDuplicate {

	public static void main(String[] args) {
		int[] nums = {1,1,1,3,3,4,3,2,4,2};
		System.out.println(containsDuplicate(nums));

	}
	
	public static boolean containsDuplicate(int[] nums) {
		HashMap<Integer, Integer> map = new HashMap<Integer,Integer>();
		for(int i =0;i<nums.length;i++) {
			if(map.containsKey(nums[i])) {
				return true;
			}
			else {
				map.put(nums[i], i);
			}
		}
		return false;
	}

}