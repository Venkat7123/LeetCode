class Solution {
    public int findPairs(int[] nums, int k) {
        Arrays.sort(nums);
        int i = 0, j = 1;
        int c = 0;
        Set <Integer> seen = new HashSet<>();
        while(i < nums.length - 1){
            if(Math.abs(nums[i] - nums[j]) == k && !seen.contains(nums[j])){
                c++;
                seen.add(nums[j]);
                System.out.println(nums[i] + " " + nums[j]);
            }
            j++;
            if(j == nums.length){
                seen.add(nums[i]);
                j = ++i + 1;
            }
        }
        return c;
        
    }
}