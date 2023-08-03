public class RemoveElementsFromArray {
    public int removeElement(int[] nums, int val) {

    int k = 0;

    for(int i = 0; i < nums.length; i++){
        if(nums[i] != val){
            int counter = nums[k];
            nums[k] = nums[i];
            nums[i] = counter;
            k++;


        }
    }

    return k;

}

}
