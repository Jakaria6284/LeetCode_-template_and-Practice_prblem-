# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def mergeTwoLists(self, list1: Optional[ListNode], list2: Optional[ListNode]) -> Optional[ListNode]:
        
        node1=list1
        node2=list2
        head=ListNode(0)
        currhead=head

        while node1!=None and node2!=None:

            if node1.val<node2.val:
               currhead.next=node1
               node1=node1.next
            else:
                currhead.next=node2
                node2=node2.next
            
            currhead=currhead.next
        

        if node1!=None:
            currhead.next=node1
        else:
            currhead.next=node2
        
        return head.next





        