class Solution {
    public ListNode partition(ListNode head, int x) {
        if(head==null)return head;
        Queue<Integer> q_l=new LinkedList<>();
        Queue<Integer> q_s=new LinkedList<>();
        ListNode cur=head;
        while(cur!=null){
            if(cur.val<x){
                q_s.add(cur.val);
            }else{
                q_l.add(cur.val);
            }
            cur=cur.next;
        }
        ListNode head2=new ListNode(Integer.MIN_VALUE);
        ListNode cur2=head2;
        while(!q_s.isEmpty()){
            ListNode nn=new ListNode(q_s.remove());
            cur2.next=nn;
            cur2=cur2.next;
        }
        while(!q_l.isEmpty()){
            ListNode nn=new ListNode(q_l.remove());
            cur2.next=nn;
            cur2=cur2.next;
        }
        return head2.next;
    }
}