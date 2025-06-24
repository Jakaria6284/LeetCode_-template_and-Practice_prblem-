class MinStack:

    def __init__(self):
        self.item=[]
        

    def push(self, val: int) -> None:
        if len(self.item)==0:
            self.item.append((val,val))
        else:
            self.item.append((val,min(val,self.item[-1][1])))
            
            


        

    def pop(self) -> None:
        if len(self.item)==0:
            return None
        return self.item.pop()
        

    def top(self) -> int:
        if len(self.item)==0:
            return None
        return self.item[-1][0]

        

    def getMin(self) -> int:
        return self.item[-1][1]


        


# Your MinStack object will be instantiated and called as such:
# obj = MinStack()
# obj.push(val)
# obj.pop()
# param_3 = obj.top()
# param_4 = obj.getMin()