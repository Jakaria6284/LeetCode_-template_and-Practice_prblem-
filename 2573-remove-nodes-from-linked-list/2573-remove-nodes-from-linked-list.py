# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

from typing import Optional

class Solution:
    def reverse(self, head: Optional[ListNode]) -> Optional[ListNode]:
        prev = None
        curr = head
        while curr:
            nextNode = curr.next
            curr.next = prev
            prev = curr
            curr = nextNode
        return prev

    def removeNodes(self, head: Optional[ListNode]) -> Optional[ListNode]:
        new_head = self.reverse(head)

        slow = new_head
        fast = new_head.next

        while fast:
            if slow.val > fast.val:
                fast = fast.next
                slow.next = fast
            else:
                slow = fast
                fast = fast.next

        final_head = self.reverse(new_head)
        return final_head
