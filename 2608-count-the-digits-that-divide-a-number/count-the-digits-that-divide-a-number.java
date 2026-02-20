class Solution {
    public int countDigits(int num) {
        int n = num;
        int ctr = 0;
        while(n > 0){
            int dig = n % 10;
            if(num % dig == 0) ctr++;
            n/=10;
        }
        return ctr;
    }
}