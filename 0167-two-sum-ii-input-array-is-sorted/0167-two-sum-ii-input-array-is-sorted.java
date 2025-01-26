class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0, right = numbers.length -1;
        while (left < right){
            int sumofcurrpair = numbers[left] + numbers[right];
            if (sumofcurrpair == target){
                break;
            }else if(sumofcurrpair > target) {
                right--;
            }
            else{
                left++;
            }
        }
        return new int[] {left + 1, right + 1};
    }
}