class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] arr = new int[k];
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        while (!map.isEmpty()) {
            int max = 0;
            int maxkey = 0;
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if (entry.getValue()>max) {
                    max = entry.getValue();
                   maxkey= entry.getKey();
                }
            }
            list.add(maxkey);
            map.remove(maxkey);
        }

        for(int i=0;i<k;i++)
        {
            arr[i]=list.get(i);
        }
        return arr;

    }
}