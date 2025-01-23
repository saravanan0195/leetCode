class Solution {
    public int firstMissingPositive(int[] nums) {
        // preprocessing the array
        for (int i = 0; i < nums.length; i++){
            if (nums[i] <= 0){
                nums[i] = nums.length + 1;
            }
        }
        //marking the indices
        for (int i = 0; i<nums.length; i++){
            int index = Math.abs(nums[i]) - 1;
            if ( index < nums.length && nums[index]>0){
                nums[index] = -1 * nums[index];
            }
        }
        //scanning the array
        for (int i = 0; i < nums.length; i++){
            if(nums[i] > 0){
                return i + 1;
            }
        }
        return nums.length + 1;
    }
}