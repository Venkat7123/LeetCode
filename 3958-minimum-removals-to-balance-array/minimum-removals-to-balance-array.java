class Solution {
    public int minRemoval(int[] nums, int k) {
        if(nums.length == 1) return 0;
        Arrays.sort(nums);
        int n = nums.length;
        int ptr = 0;
        int res = n;
        
        for(int itr = 0; itr < n; itr++){
            while(ptr < n && nums[ptr] <= (long) nums[itr] * k) ptr++;
            res = Math.min(res, n - (ptr - itr));
        }
        return res;
    }
}