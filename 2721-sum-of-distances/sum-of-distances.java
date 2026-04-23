class Solution {
    public long[] distance(int[] nums) {
        HashMap<Integer,ArrayList<Integer>> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
           if(!map.containsKey(nums[i])) {
                map.put(nums[i], new ArrayList<>());
            }
            map.get(nums[i]).add(i);
        }

       long[] ans = new long[nums.length];
        for(ArrayList<Integer> indices : map.values()) {
            int n = indices.size();
            long sum = 0;
            for(int i = 0; i < n; i++) {
                sum += indices.get(i);
            }
            long leftsum = 0;
            long rightsum = sum;
            long currsum = 0;
            for(int i = 0; i < n; i++) {
                currsum = 0;
                currsum += (long)i*(long)indices.get(i) - leftsum;
                currsum += rightsum - (long)(n-i)*(long)indices.get(i);
                leftsum += (long)indices.get(i);
                rightsum -= (long)indices.get(i);
                ans[indices.get(i)] = currsum;
            }
        }
        return ans;
    }
}