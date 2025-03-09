class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[1] - b[1]);
        int count = 1;
        int prev = 0;
        for (int curr = 1; curr < intervals.length; curr++) {
            if (intervals[prev][1] <= intervals[curr][0]) {
                count++;
                prev = curr;
            }
        }
        return (intervals.length - count);
    }
}