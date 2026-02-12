class Solution {
    public String reverseVowels(String s) {
        char[] str = s.toCharArray();
        int l = 0, r = s.length() - 1;
        while (l < r) {
            while(l < r && !isVowel(str[l])) l++;
            while(l < r && !isVowel(str[r])) r--;
            char temp = str[l];
            str[l] = str[r];
            str[r] = temp;
            l++;
            r--;
        }
        return new String(str);
    }
    static boolean isVowel(char ch){
        if(ch == 'a' || ch == 'e' || ch == 'o' || ch == 'i' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
            return true;
        }
        return false;
    }
}