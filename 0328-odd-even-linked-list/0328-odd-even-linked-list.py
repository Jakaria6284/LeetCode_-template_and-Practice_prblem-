# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def oddEvenList(self, head: Optional[ListNode]) -> Optional[ListNode]:

        if head==None or head.next==None:
            return head
        



        slow=head.next
        slowhead=head.next
        fast=head

        while fast.next!=None and slow.next!=None:
            fast.next=fast.next.next
            fast=fast.next

            slow.next=slow.next.next
            slow=slow.next
        fast.next=slowhead

        return head
        