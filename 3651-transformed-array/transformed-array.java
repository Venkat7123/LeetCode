class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int len = nums.length;
        int[] result = new int[len];
        int itr;
        for(int i = 0; i < len; i++){
            result[i] = nums[(((i + nums[i]) % len) + len) % len];
        }
        return result;
    }
}