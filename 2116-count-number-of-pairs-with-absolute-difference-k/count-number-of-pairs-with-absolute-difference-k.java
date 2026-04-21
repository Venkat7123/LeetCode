class Solution {
    public int countKDifference(int[] nums, int k) {
        int i = 0, j = 1;
        int c = 0;
        while(i < nums.length - 1){
            if(Math.abs(nums[i] - nums[j]) == k){
                c++;
            }
            j++;
            if(j == nums.length){
                j = ++i + 1;
            }
        }
        return c;
    }
}