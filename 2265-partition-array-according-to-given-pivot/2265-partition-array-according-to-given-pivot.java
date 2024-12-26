class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        List<Integer> lessPivot = new ArrayList<>();
        List<Integer> eqPivot = new ArrayList<>();
        List<Integer> greaterPivot = new ArrayList<>();
        List<Integer> res = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < pivot) {
                lessPivot.add(nums[i]);
            } else if (nums[i] > pivot) {
                greaterPivot.add(nums[i]);
            } else {
                eqPivot.add(nums[i]);
            }
        }

        res.addAll(lessPivot);
        res.addAll(eqPivot);
        res.addAll(greaterPivot);

        int []result=new int[res.size()];


        for(int i=0;i<result.length;i++)
        {
            result[i]=res.get(i);

        }

        return result;

    }
}