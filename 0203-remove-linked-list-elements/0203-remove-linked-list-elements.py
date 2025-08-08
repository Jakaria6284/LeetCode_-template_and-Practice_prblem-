# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeElements(self, head: Optional[ListNode], val: int) -> Optional[ListNode]:
        node1=ListNode(0)
        node1.next=head

        node=node1



        while node!=None and node.next!=None:


            if node.val!=val and node.next.val==val:
                node.next=node.next.next
            else:
                node=node.next


            
        return node1.next
        