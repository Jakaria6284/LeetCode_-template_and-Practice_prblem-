# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def addTwoNumbers(self, l1: Optional[ListNode], l2: Optional[ListNode]) -> Optional[ListNode]:
        sum=0
        carry:int=0
        node=ListNode(0)
        dummy=node

        while l1!=None or l2!=None or carry!=0:
            if l1!=None:
                sum+=l1.val
                l1=l1.next
            if l2!=None:
                sum+=l2.val
                l2=l2.next
            
            sum=sum+carry
            carry=sum//10

            new_node=ListNode(sum%10)
            dummy.next=new_node
            dummy=dummy.next
            sum=0
        return node.next
        




            

        