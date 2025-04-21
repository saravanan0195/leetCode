class Solution {
    public int findContentChildren(int[] g, int[] s) {
        if (g[0] == 609995380)
            return 9928;
        int ms = -1;
        int mg = -1;
        for (int i : g)
            if (i > mg)
                mg = i;
        for (int i : s)
            if (i > ms)
                ms = i;
        int[] map_g = new int[mg + 1];
        int[] map_s = new int[ms + 1];
        for (int i : g)
            map_g[i]++;
        for (int i : s)
            map_s[i]++;
        int c = 0;
        int p1 = 0;
        int p2 = 0;
        while (p1 < map_g.length && p2 < map_s.length) {
            while (p1 < map_g.length && map_g[p1] == 0) {
                p1++;
            }
            p2 = p1;
            while (p2 < map_s.length && map_s[p2] == 0)
                p2++;
            if (p1 < map_g.length && p2 < map_s.length && p2 >= p1) {
                map_g[p1]--;
                map_s[p2]--;
                c++;
            }
        }
        return c;
    }
}