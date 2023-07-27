
public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {

        int k = 1;

        for(int i = 1;i<nums.length;i++)

        {
            if (nums[i] != nums[i - 1]) {
                nums[k] = nums[i];
                k++;

            }


        }
        return k;

    }
// Start with a counter for where items will be placed in new array , starts at 1 because 0 will always be unique.
//iterate through nums with a seperate counter keeping track of the spot in the original array we are comparing to our mutated array with no repeats.

//if the item at current iteration is not the same as the one spot before it, then add that item to the mutated array at the spot of the counter we first initialized.

//increment to the next slot in mutated array (original counter) if unique, increment to the next iteration of original array.

}

