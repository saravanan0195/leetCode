class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int n = intervals.length;
        List<int[]> result = new ArrayList<>();
        int i = 0;
        // find out interval on the left of newInterval (non-overlapping)
        while (i < n && intervals[i][1] < newInterval[0]) { 
            result.add(intervals[i]);
            i++;
        }
        // find this interval: [startTime, endTime]
        while (i < n && intervals[i][0] <= newInterval[1]) {
            int startTime = Math.min(intervals[i][0], newInterval[0]);
            int endTime = Math.max(intervals[i][1], newInterval[1]);
            newInterval[0] = startTime;
            newInterval[1] = endTime;
            i++;
        }
        result.add(newInterval);
        while (i < n) {
            result.add(intervals[i]);
            i++;
        }
        return result.toArray(new int[result.size()][2]);
    
    }
}