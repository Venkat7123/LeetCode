class Solution {
    public String replaceDigits(String s) {
        char[] str = s.toCharArray();
        for(int i = 1; i < str.length; i += 2){
            str[i] = (char)(str[i - 1] + (str[i] - '0'));
        }
        return new String(str);
    }
}