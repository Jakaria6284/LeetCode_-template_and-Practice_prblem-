
class Solution {
    public ListNode modifiedList(int[] nums, ListNode head) {
        Set<Integer>set=new HashSet<>();
        for(int num:nums)
        {
            set.add(num);
        }

        ListNode dumy=new ListNode(0,head);
        ListNode curr=dumy;

        while(curr.next!=null)
        {
            if(set.contains(curr.next.val))
            {
                curr.next=curr.next.next;
            }else
            {
                curr=curr.next;
            }
        }

        return dumy.next;
    }
}
