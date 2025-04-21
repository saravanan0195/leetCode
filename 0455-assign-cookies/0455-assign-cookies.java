class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int idx = 0;
        for (int i = 0; i < s.length && idx < g.length; i++) {
            if (s[i] >= g[idx]) {
                idx++;
            }
        }
        return idx;
    }
}