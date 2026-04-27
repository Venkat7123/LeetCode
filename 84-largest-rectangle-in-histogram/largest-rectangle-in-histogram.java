class Solution {
    public int largestRectangleArea(int[] heights) {
        int max_rectangle=0;
        Stack<Integer> stack= new Stack<>();
        for(int i = 0; i <= heights.length; i++){
            int curr = (i == heights.length) ? 0 : heights[i];
            while(!stack.isEmpty() && heights[stack.peek()] > curr){
                int x = stack.pop();
                int width;
                if(stack.isEmpty()) width = i;
                else width = i - stack.peek() - 1;
                max_rectangle = Math.max(max_rectangle, heights[x] * width);
            }
            stack.push(i);
        }
        return max_rectangle;
    }
}