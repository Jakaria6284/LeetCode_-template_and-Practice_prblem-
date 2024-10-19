/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeNodes(ListNode head) {
       /* ArrayList<Integer>list=new ArrayList<>();
        ListNode temp=head.next;
        int sum=0;

        while(temp!=null)
        {
           if(temp.val!=0)
           {
            sum=sum+temp.val;
            temp=temp.next;
           }else if(temp.val==0)
           {
            list.add(sum);
            sum=0;
            temp=temp.next;
           }
        }

        ListNode dumy=new ListNode(0);
        ListNode temp2=dumy;

        for(int i=0;i<list.size();i++)
        {
           ListNode node=new ListNode(list.get(i));
           temp2.next=node;
           temp2=temp2.next;
        }

        return dumy.next;*/

        ListNode currHead=head.next;
        ListNode temp=currHead;

        while(temp!=null)
        {
            int sum=0;
            while(temp.val!=0)
            {
                sum=sum+temp.val;
                temp=temp.next;
            }
            currHead.val=sum;
            temp=temp.next;
            currHead.next=temp;
            currHead=currHead.next;

        }

        return head.next;

        
    }
}