class Solution {
    public int alternateDigitSum(int n) {
        int len = String.valueOf(n).length();
        int sum = 0;
        int n1 = len % 2 == 0 ? -1 : 1;
        while(n > 0){
            int dig = n % 10;
            dig *= n1;
            n1*=-1;
            sum += dig;
            n/=10;
        }
        return sum;
    }
}