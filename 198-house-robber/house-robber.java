class Solution {
    public int rob(int[] nums) {
        int sum = 0;
        int max = 0;
        for(int i : nums){
            int temp = Math.max(max, sum + i);
            sum = max;
            max = temp;
        }
        return max;
    }
}