class MyCalendar {
    int end = 0;
    int start = 0;
    List<int[]> list;

    public MyCalendar() {
        list = new ArrayList<>();
    }

    public boolean book(int start, int end) {

        for (int[] e : list) {
            if (start < e[1] && end>e[0]) {
                return false;
            }

        }
        list.add(new int[] { start, end });
        return true;

    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(startTime,endTime);
 */