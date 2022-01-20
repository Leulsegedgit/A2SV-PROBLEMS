class MinStack:
    
    def __init__(self):
        self.min_stack = []
        self.main_stack = []
        

    def push(self, val: int) -> None:
        self.main_stack.append(val)
        if len(self.min_stack)==0 or val<=self.min_stack[-1]:
            self.min_stack.append(val)
        

    def pop(self) -> None:
        if self.min_stack[-1] == self.main_stack[-1]:
            self.min_stack.pop()
        self.main_stack.pop()
        
        

    def top(self) -> int:
        return self.main_stack[-1]
        

    def getMin(self) -> int:
        return  self.min_stack[-1]
