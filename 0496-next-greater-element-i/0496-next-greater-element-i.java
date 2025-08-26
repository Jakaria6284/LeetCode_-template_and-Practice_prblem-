class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        int result[]=new int[nums1.length];

        Map<Integer,Integer>map=new HashMap<>();
        Stack<Integer>stack=new Stack<>();


        for(int num:nums2)
        {
            while(!stack.isEmpty() && num>stack.peek())
            {
              map.put(stack.pop(),num);
            }
            stack.push(num);
        }

        while(!stack.isEmpty())
        {
            map.put(stack.pop(),-1);
        }

        for(int i=0;i<nums1.length;i++)
        {
            result[i]=map.get(nums1[i]);
        }

        return result;
        
    }
}