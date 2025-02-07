class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        List<List<Integer>> res = new ArrayList<>();
        int fstart = intervals[0][0];
        int fend = intervals[0][1];

        for (int i = 1; i < intervals.length; i++) {
            int start = intervals[i][0];
            int end = intervals[i][1];
            if (start <= fend) {
                fend = Math.max(fend, end);
            } else {
                List<Integer> list = new ArrayList<>();
                list.add(fstart);
                list.add(fend);
                res.add(list);  
                fstart = start;
                fend = end;
            }
        }
        res.add(new ArrayList<>(Arrays.asList(fstart, fend))); 

        // Convert List<List<Integer>> to int[][]
        int[][] result = new int[res.size()][2];
        for (int i = 0; i < res.size(); i++) {
            result[i][0] = res.get(i).get(0);
            result[i][1] = res.get(i).get(1);
        }

        return result;
    }
}
