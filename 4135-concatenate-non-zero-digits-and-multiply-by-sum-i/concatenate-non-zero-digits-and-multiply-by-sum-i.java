class Solution {
    public long sumAndMultiply(int n) {
        long num = 0, i = 1, sum = 0;
        while(n > 0){
            int dig = n % 10;
            if(dig != 0){
                System.out.println(dig);
                num += (long)dig * i;
                i *= 10;
                sum += (long)dig;
            }
            n /= 10;
        }

        return num * sum;
    }
}