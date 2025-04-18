class Solution {
    List<Integer> result;
    int[] subsetSizeMemo;
    public List<Integer> largestDivisibleSubset(int[] nums) {
         Arrays.sort(nums);
        subsetSizeMemo = new int[nums.length];
        Arrays.fill(subsetSizeMemo, -1);
        result = new ArrayList<>();
        helper(nums, 0, new ArrayList<>(), 1);
        return result;
    }
    private void helper(int[] nums, int index, List<Integer> currList, int prev) {
        if (currList.size() > result.size()) {
            result = new ArrayList<>(currList);
        }
        for (int i = index; i < nums.length; i++) {
            if (currList.size() > subsetSizeMemo[i] && nums[i] % prev == 0) {
                subsetSizeMemo[i] = currList.size();
                currList.add(nums[i]);
                helper(nums, i + 1, currList, nums[i]);
                currList.remove(currList.size() - 1);
            }
        }
    }
}