# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def middleNode(self, head: Optional[ListNode]) -> Optional[ListNode]:

        if head==None:
            return head
        slow=head
        fast=head

        if head.next==None:
            return head
        if head.next.next==None:
            return head.next

        while fast and fast.next!=None:
            slow=slow.next
            fast=fast.next.next
        return slow

        