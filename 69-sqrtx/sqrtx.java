class Solution {
    public int mySqrt(int x) {
        if(x < 2) return x;
        int l = 0, r = x / 2;
        int ans = 0;
        while(l <= r){
            int mid = l + (r - l) / 2;
            long sq = (long) mid * mid;
            if(sq < x){
                ans = mid;
                l = mid + 1;
            }
            else if(sq > x){
                r = mid - 1;
            }
            else{
                return mid;
            }
        }
        return ans;
    }
}