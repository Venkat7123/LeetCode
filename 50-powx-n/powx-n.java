class Solution {
    public double myPow(double x, int n) {
        long exp = n;
        if(exp < 0){
            x = 1.0 / x;
            exp = -exp;
        }
        double base = x;
        double result = 1.0;
        while(exp > 0){
            if(exp % 2 == 1){
                result *= base;
            }
            base *= base;
            exp /= 2; 
        }
        return result;
    }
}