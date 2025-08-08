# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def getDecimalValue(self, head: Optional[ListNode]) -> int:
        ans=""

        while head!=None:
            ans=ans+str(head.val)
            head=head.next
        
        result=int(ans,2)
        return result

        