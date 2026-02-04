class Solution {
    public boolean hasGroupsSizeX(int[] deck) {
        Map <Integer, Integer> pair = new HashMap<>();
        if(deck.length <= 1) return false;

        for(int itr = 0; itr < deck.length; itr++){
            pair.put(deck[itr], pair.getOrDefault(deck[itr], 0) + 1);
        }
        int value = 0;
        for(int num: pair.values()){
            value = gcd(value, num);
        }
        return value >= 2;
    }
    public int gcd(int val, int num){
        if(num == 0) return val;
        return gcd(num, val % num);
    }
}