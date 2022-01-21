class MyQueue {
    List<Integer> queue ;
    public MyQueue() {
        queue = new ArrayList<Integer>();
    }
    
    public void push(int x) {
        queue.add(x);
    }
    
    public int pop() {
        int val = queue.get(0);
        queue.remove(0);
        return val;
    }
    
    public int peek() {
        return queue.get(0);
    }
    
    public boolean empty() {
        if(queue.size()==0)
            return true;
        else 
            return false;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
