class Solution {
    public int majorityElement(int[] nums) {
        int count = 1, element = nums[0];
        for(int i=1;i<nums.length;i++){
            if(count == 0){
                count = 1;
                element = nums[i];
                continue;
            }
            if(nums[i] == element) count++;
            else count--;
        }
        return element;
    }
}