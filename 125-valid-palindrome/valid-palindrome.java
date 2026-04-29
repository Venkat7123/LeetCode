class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        int n = s.length();
        int l = 0, r = s.length() - 1;
        while(l < r){
            char ch1 = s.charAt(l);
            char ch2 = s.charAt(r);
            if(ch1 != ch2) return false;
            l++;
            r--;
        }
        return true;
    }
}