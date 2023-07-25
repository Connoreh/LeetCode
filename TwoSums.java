import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {


        Map<Integer, Integer> map = new HashMap<>();
        int [] solution = new int[2];

        for (int i=0; i <= nums.length; i++){

            if(map.containsKey(target-nums[i])){
                solution[0] = i;
                solution[1] = map.get(target-nums[i]);
                return solution;
            }
            map.put(nums[i], i);
        }
        return solution;
    }
}

//search array of numbers to see if two add up to equal int target

//create a hashmap that will store each number of the array as the key, and the iterator as the value.

//search the hashmap to see if the result of target - the iteration of nums currently being checked is included in the hashmap. if so, two numbers summing to target are included in the array

//once established the array holds two sums =  target, add those numbers to a new array only holding the solution, which can be returned.

//search through the nums array for the length of the array.

//

//







// for (int numberTestedInTwoSumArray: nums) {

// }
        
    