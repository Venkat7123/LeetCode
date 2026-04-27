class Solution {
    public int trailingZeroes(int n) {
        if(n > 0 && n < 5) return 0;
        int fives = 5;
        int tens = 0;
        while(fives <= n){
            tens += n/fives;
            System.out.println(n/fives);
            fives *= 5;
        }
        return tens;
    }
}