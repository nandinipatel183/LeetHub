class Solution {
    public int[][] merge(int[][] intervals) {

        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        int n = intervals.length;
        List<List<Integer>> result = new ArrayList<>();

        int i = 0;

        while (i < n) {

            int start = intervals[i][0];
            int end = intervals[i][1];

            int j = i + 1;

            // 🔥 FIX: use while instead of if
            while (j < n && intervals[j][0] <= end) {
                end = Math.max(end, intervals[j][1]);
                j++;
            }

            result.add(Arrays.asList(start, end));

            i = j;
        }

        // 🔥 Convert List to int[][]
        int[][] ans = new int[result.size()][2];
        for (int k = 0; k < result.size(); k++) {
            ans[k][0] = result.get(k).get(0);
            ans[k][1] = result.get(k).get(1);
        }

        return ans;
    }
}