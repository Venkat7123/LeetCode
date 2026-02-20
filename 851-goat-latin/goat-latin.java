class Solution {
    public String toGoatLatin(String sentence) {
        String[] str = sentence.trim().split(" ");
        String a = "a";
        for(int itr = 0; itr < str.length; itr++){
            if(isVowel(str[itr].charAt(0))){
                str[itr] += "ma";
            }
            else{
                str[itr] = str[itr].substring(1) + str[itr].charAt(0) + "ma";
            }
            str[itr] += a;
            a += "a";
        }

        return String.join(" ", str);
    }
    static boolean isVowel(char ch){
        if(ch == 'a' || ch == 'e' || ch == 'o' || ch == 'i' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
            return true;
        }
        return false;
    }
}