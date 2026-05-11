class Solution {
    public int[] separateDigits(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        for(int i = nums.length - 1; i >= 0; i--){
            int n = nums[i];
            while(n > 0){
                ans.add(n%10);
                n/=10;
            }
        }
        Collections.reverse(ans);
        int[] res = ans.stream().mapToInt(i -> i).toArray();

        return res;
    }
}