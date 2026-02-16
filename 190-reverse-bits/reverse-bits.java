class Solution {
    public int reverseBits(int n) {
        return rev(n, 32);
    }
    static int rev(int n, int len){
        if(len == 1) return n & 1;
        
        int half = len >> 1;
        int mask = (1 << half) - 1;
        int low = n & mask;
        int high = n >>> half;
        return (rev(low, half) << half) | rev (high, half);
    }
}