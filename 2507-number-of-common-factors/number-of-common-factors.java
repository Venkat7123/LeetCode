class Solution {
    public int commonFactors(int a, int b) {
        int f = 1;
        int count = 0;
        while(a >= f && b >= f){
            if(a % f == 0 && b % f == 0) count++;
            f++;
        }
        return count;
    }
}