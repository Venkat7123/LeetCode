class Solution {
    public boolean isThree(int n) {
        int itr = 2, ctr = 2;
        while(itr <= n/2){
            if(n % itr == 0) ctr++;
            if(ctr > 3) return false;
            itr++;
        }
        return ctr == 3;
    }
}