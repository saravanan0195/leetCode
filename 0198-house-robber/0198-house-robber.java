class Solution {
    public int rob(int[] nums) {
        if (nums.length == 1) return nums[0];
        int[] dp = new int[nums.length + 1];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        for (int i = 2; i < nums.length; i++) {
            int rob = nums[i] + dp[i - 2];
            int notRob = dp[i - 1];
            dp[i] = Math.max(rob, notRob);
        }
        return dp[nums.length - 1];
    }
}