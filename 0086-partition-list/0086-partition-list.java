class Solution {
    public ListNode partition(ListNode head, int x) {
        
        ListNode small=new ListNode(0);
        ListNode high=new ListNode(0);

        ListNode smalldumy=small;
        ListNode highdumy=high;

        while(head!=null)
        {
            if(head.val<x)
            {
                smalldumy.next=head;
                smalldumy=smalldumy.next;
            }else
            {
                highdumy.next=head;
                highdumy=highdumy.next;
            }
            head=head.next;
        }

        highdumy.next=null;
        smalldumy.next=high.next;

        return small.next;
    }
}