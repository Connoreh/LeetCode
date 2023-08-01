public class SortColor {
    public void sortColors(int[] nums) {
        int blue = 0;
        int red = 0;
        int white = 0;

        for(int i = 0; i < nums.length; i++){
            if (nums[i] == 0){
                red++;
            }
            else if(nums[i] == 1){
                white++;
            }
            else if (nums[i] == 2){
                blue++;
            }
        }

        for(int i=0; i< nums.length; i++){
            if( i < red){nums[i] = 0;}
            else if( i < white + red){nums[i] = 1;}
            else{nums[i] = 2;}
        }


    }
}

