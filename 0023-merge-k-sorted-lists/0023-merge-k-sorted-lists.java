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
    public ListNode mergeKLists(ListNode[] lists) {
        ArrayList<Integer>list=new ArrayList<>();
        

        for(ListNode head:lists)
        {
            while(head!=null)
            {
              list.add(head.val);
              head=head.next;
            }
        }

        Collections.sort(list);
        ListNode dumy=new ListNode(0);
        ListNode temp=dumy;

        for(int value:list)
        {
            ListNode finallist=new ListNode(value);
            temp.next=finallist;
            temp=temp.next;
            

        }

        return dumy.next;
    }
}

/*
class Solution {
    
    public ListNode mergeKLists(ListNode[] lists) {     
        if(lists == null || lists.length == 0) {
            return null;
        }
        
        if(lists.length == 1) {
            return lists[0];
        }
        
        ListNode head = mergeTwoLinkedList(lists[0], lists[1]);
        for(int i=2; i< lists.length; i++) {
            head = mergeTwoLinkedList(head, lists[i]);
        }
        return head;
    }

    
    //Merge two linkedList
    private ListNode mergeTwoLinkedList(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(-1);
        ListNode head = dummy;
        
        while(list1 != null && list2!= null) {
            
            if(list1.val < list2.val) {
                dummy.next = list1;
                list1 = list1.next;
            } else {
                dummy.next = list2;
                list2 =list2.next;
            }
            
            dummy = dummy.next;
            
        }
        
        while(list1 != null) {
            dummy.next = list1;
            list1 = list1.next;
            dummy = dummy.next;
        }
        
         while(list2 != null) {
            dummy.next = list2;
            list2 = list2.next;
            dummy = dummy.next;
        }
        
        return head.next;
    }
}
*/
