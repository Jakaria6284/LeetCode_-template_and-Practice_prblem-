# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:
    def lengthofList(self, head: ListNode) -> int:
        size = 0
        while head is not None:
            size += 1
            head = head.next
        return size

    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        if head is None:
            return head

        sizeOfList = self.lengthofList(head)
        dltNode = sizeOfList - n

        # If we need to delete the head node
        if dltNode == 0:
            return head.next

        pointer = head
        for i in range(dltNode - 1):  # go to node just before the one to delete
            pointer = pointer.next

        # delete the nth node
        if pointer.next is not None:
            pointer.next = pointer.next.next

        return head
