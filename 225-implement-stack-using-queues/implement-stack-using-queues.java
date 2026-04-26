class MyStack {
    Queue<Integer> queue1;
    public MyStack() {
        queue1 = new LinkedList<>();
    }
    
    public void push(int x) {
        queue1.add(x);
        int size = queue1.size();
        for(int i = 0; i < size - 1; i++){
            queue1.add(queue1.remove());
        }
    }
    
    public int pop() {
        return queue1.remove();
    }
    
    public int top() {
        return queue1.peek();
    }
    
    public boolean empty() {
        return queue1.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */