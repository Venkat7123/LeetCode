class Solution {
    public String replaceDigits(String s) {
        char[] str = s.toCharArray();
        for(int itr = 1; itr < s.length(); itr+=2){
            str[itr] = (char)(str[itr-1] + (str[itr] - '0'));
        }
        return new String(str);
    }
}